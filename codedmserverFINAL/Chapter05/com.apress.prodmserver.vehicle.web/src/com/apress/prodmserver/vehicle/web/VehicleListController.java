package com.apress.prodmserver.vehicle.web;

import com.apress.prodmserver.vehicle.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleListController {

    private VehicleService vehicleService;

    @Autowired
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping("/vehicleList.htm")
    public String list(Model model) {
        model.addAttribute("vehicles", vehicleService.list());
        return "vehicleList";
    }
}