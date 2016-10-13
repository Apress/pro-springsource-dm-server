package com.apress.prodmserver.vehicle.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apress.prodmserver.vehicle.domain.Vehicle;
import com.apress.prodmserver.vehicle.repository.VehicleDao;


@Repository
@Transactional
public class JpaVehicleDao implements VehicleDao {

	
    @PersistenceContext
    private EntityManager entityManager;

    public void store(Vehicle vehicle) {
        entityManager.merge(vehicle);
    }

    @Transactional(readOnly = true)
    public Vehicle load(Long id) {
        return entityManager.find(Vehicle.class, id);
    }

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        Query query = entityManager.createQuery("select v from Vehicle v");
        return query.getResultList();
    }
}