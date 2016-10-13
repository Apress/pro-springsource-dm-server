package com.apress.prodmserver.vehicle.service;

import java.util.List;

import com.apress.prodmserver.vehicle.domain.Vehicle;
import com.apress.prodmserver.vehicle.domain.Status;

public interface VehicleService {

    public void register(Vehicle vehicle);
    public void updateStatus(Long vehicleId, Status status);
    public List<Vehicle> list();
}
