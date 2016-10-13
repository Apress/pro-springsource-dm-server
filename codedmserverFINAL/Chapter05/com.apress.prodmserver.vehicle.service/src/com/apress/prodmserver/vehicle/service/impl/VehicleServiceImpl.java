package com.apress.prodmserver.vehicle.service.impl;

import java.util.List;

import com.apress.prodmserver.vehicle.domain.Vehicle;
import com.apress.prodmserver.vehicle.domain.Status;

import com.apress.prodmserver.vehicle.repository.VehicleDao;

import com.apress.prodmserver.vehicle.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class VehicleServiceImpl implements VehicleService {

    private VehicleDao vehicleDao;

    @Autowired
    public void setVehicleDao(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    public void register(Vehicle vehicle) {
        vehicle.setStatus(Status.ACTIVE);
        vehicleDao.store(vehicle);
    }

    public void updateStatus(Long vehicleId, Status status) {
        Vehicle vehicle = vehicleDao.load(vehicleId);
        vehicle.setStatus(status);
        vehicleDao.store(vehicle);
    }

    @Transactional(readOnly = true)
    public List<Vehicle> list() {
        return vehicleDao.findAll();
    }
}
