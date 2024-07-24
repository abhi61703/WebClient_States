package com.ust.StateService.Stateservice;

import com.ust.StateService.DTO.StateWithDistrictsDto;
import com.ust.StateService.Model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class Stateservice {

    private final WebClient webClient;

    @Autowired
    public Stateservice(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public StateWithDistrictsDto getStateWithDistrictsByCode(String stateCode) {
        // Fetch the state from State microservice
        State state = webClient.get()
                .uri("http://localhost:8081/states/" + stateCode)
                .retrieve()
                .bodyToMono(State.class)
                .block();

        if (state != null) {
            // Fetch districts from District microservice
            List<StateWithDistrictsDto.District> districts = webClient.get()
                    .uri("http://localhost:8082/districts/" + stateCode)
                    .retrieve()
                    .bodyToFlux(StateWithDistrictsDto.District.class)
                    .collectList()
                    .block();

            // Prepare the response DTO
            StateWithDistrictsDto response = new StateWithDistrictsDto();
            response.setStateId(state.getStateId());
            response.setStateName(state.getStateName());
            response.setStatePopulation(state.getStatePopulation());
            response.setStateWebsite(state.getStateWebsite());
            response.setStateCm(state.getStateCm());
            response.setStateCode(state.getStateCode());
            response.setDistricts(districts);

            return response;
        }

        return null;
    }
}