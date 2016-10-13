package com.apress.prodmserver.vehicle.web.validation;

import com.apress.prodmserver.vehicle.domain.Vehicle;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;


public class VehicleValidator {

    public void validate(Vehicle vehicle, Errors errors) {
        if (!StringUtils.hasLength(vehicle.getVehicleNo())) {
            errors.rejectValue("vehicleNo", "required", "required");
        }
        if (!StringUtils.hasLength(vehicle.getColor())) {
            errors.rejectValue("color", "required", "required");
        }
        if (vehicle.getWheel() <= 0) {
            errors.rejectValue("wheel", "invalid", "invalid");
        }
        if (vehicle.getSeat() <= 0) {
            errors.rejectValue("seat", "invalid", "invalid");
        }
    }
}
