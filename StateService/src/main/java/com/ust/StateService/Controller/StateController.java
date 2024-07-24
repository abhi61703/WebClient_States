package com.ust.StateService.Controller;


import com.ust.StateService.DTO.StateWithDistrictsDto;
import com.ust.StateService.Stateservice.Stateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @Autowired
    private Stateservice stateService;

    @GetMapping("/states/{stateCode}")
    public StateWithDistrictsDto getStateWithDistricts(@PathVariable String stateCode) {
        return stateService.getStateWithDistrictsByCode(stateCode);
    }
}
