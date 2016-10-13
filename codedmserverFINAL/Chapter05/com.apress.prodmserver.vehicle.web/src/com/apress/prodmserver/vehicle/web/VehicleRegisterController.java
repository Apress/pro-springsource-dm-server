package com.apress.prodmserver.vehicle.web;

import com.apress.prodmserver.vehicle.service.VehicleService;
import com.apress.prodmserver.vehicle.domain.Vehicle;
import com.apress.prodmserver.vehicle.web.validation.VehicleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/vehicleRegister.htm")
public class VehicleRegisterController {

    private VehicleService vehicleService;

    @Autowired
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
        return "vehicleRegister";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(@ModelAttribute("vehicle") Vehicle vehicle,
            BindingResult result, SessionStatus status) {
        new VehicleValidator().validate(vehicle, result);
        if (result.hasErrors()) {
            return "vehicleRegister";
        } else {
            vehicleService.register(vehicle);
            status.setComplete();
            return "redirect:vehicleList.htm";
        }
    }
}
