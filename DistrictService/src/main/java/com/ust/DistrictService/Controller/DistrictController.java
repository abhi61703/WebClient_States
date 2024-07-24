package com.ust.DistrictService.Controller;

import com.ust.DistrictService.Dto.DistrictDto;
import com.ust.DistrictService.Model.District;
import com.ust.DistrictService.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/districts/{stateCode}")
    public List<District> getDistrictsByStateCode(@PathVariable String stateCode) {
        return districtService.getDistrictsByStateCode(stateCode);
    }
}
