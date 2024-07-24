package com.ust.StateService.DTO;

import java.util.List;

public class StateWithDistrictsDto {
    private Long stateId;
    private String stateName;
    private Long statePopulation;
    private String stateWebsite;
    private String stateCm;
    private String stateCode;
    private List<District> districts;

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

    public Long getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(Long statePopulation) {
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
// Getters and Setters

    public static class District {
        private Long districtId;
        private String districtName;
        private Long districtPopulation;
        private String districtWebsite;

        public Long getDistrictId() {
            return districtId;
        }

        public void setDistrictId(Long districtId) {
            this.districtId = districtId;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public Long getDistrictPopulation() {
            return districtPopulation;
        }

        public void setDistrictPopulation(Long districtPopulation) {
            this.districtPopulation = districtPopulation;
        }

        public String getDistrictWebsite() {
            return districtWebsite;
        }

        public void setDistrictWebsite(String districtWebsite) {
            this.districtWebsite = districtWebsite;
        }
// Getters and Setters
    }
}
