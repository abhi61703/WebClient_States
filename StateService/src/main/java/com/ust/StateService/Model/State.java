package com.ust.StateService.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stateId;

    private String stateName;
    private String stateCode;  // e.g., KA for Karnataka
    private long statePopulation;
    private String stateWebsite;
    private String stateCm;

    // Getters and Setters
    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public long getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(long statePopulation) {
        this.statePopulation = statePopulation;
    }

    public String getStateWebsite() {
        return stateWebsite;
    }

    public void setStateWebsite(String stateWebsite) {
        this.stateWebsite = stateWebsite;
    }

    public String getStateCm() {
        return stateCm;
    }

    public void setStateCm(String stateCm) {
        this.stateCm = stateCm;
    }

}
