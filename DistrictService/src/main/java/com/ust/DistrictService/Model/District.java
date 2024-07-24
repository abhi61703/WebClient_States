package com.ust.DistrictService.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long districtId;

    private String districtName;
    private String stateCode;
    private long districtPopulation;
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public long getDistrictPopulation() {
        return districtPopulation;
    }

    public void setDistrictPopulation(long districtPopulation) {
        this.districtPopulation = districtPopulation;
    }

    public String getDistrictWebsite() {
        return districtWebsite;
    }

    public void setDistrictWebsite(String districtWebsite) {
        this.districtWebsite = districtWebsite;
    }
}
