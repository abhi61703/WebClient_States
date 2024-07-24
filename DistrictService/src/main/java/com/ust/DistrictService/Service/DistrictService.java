package com.ust.DistrictService.Service;


import com.ust.DistrictService.Model.District;
import com.ust.DistrictService.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<District> getDistrictsByStateCode(String stateCode) {
        return districtRepository.findByStateCode(stateCode);
    }
}
