package com.ust.DistrictService.Dto;

public class DistrictDto {

    private Long districtId;
    private String districtName;
    private Long districtPopulation;
    private String districtWebsite;

    // Getters and Setters

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
}
