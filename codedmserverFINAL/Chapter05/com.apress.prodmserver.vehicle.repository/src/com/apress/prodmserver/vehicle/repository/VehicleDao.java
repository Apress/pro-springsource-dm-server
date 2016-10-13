package com.apress.prodmserver.vehicle.repository;

import java.util.List;
import com.apress.prodmserver.vehicle.domain.Vehicle;

public interface VehicleDao {

    public void store(Vehicle vehicle);
    public Vehicle load(Long id);
    public List<Vehicle> findAll();
}
