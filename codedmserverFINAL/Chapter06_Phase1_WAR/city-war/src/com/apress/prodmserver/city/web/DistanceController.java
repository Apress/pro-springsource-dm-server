package com.apress.prodmserver.city.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apress.prodmserver.city.service.CityService;

@Controller
@RequestMapping("/distance.htm")
public class DistanceController {

    private CityService cityService;

    @Autowired
    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm() {
        return "distance";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @RequestParam(value = "srcCity", required = false) String srcCity,
            @RequestParam(value = "destCity", required = false) String destCity,
            Model model) {
        Double distance = cityService.findDistance(srcCity, destCity);
        model.addAttribute("distance", distance);
        return "distance";
    }
}

