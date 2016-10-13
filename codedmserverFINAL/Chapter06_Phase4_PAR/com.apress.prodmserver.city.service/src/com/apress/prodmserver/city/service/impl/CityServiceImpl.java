package com.apress.prodmserver.city.service.impl;

import java.util.Map;

import com.apress.prodmserver.city.service.CityService;

public class CityServiceImpl implements CityService {

    private Map<String, Map<String, Double>> distanceMap;

    public void setDistanceMap(Map<String, Map<String, Double>> distanceMap) {
        this.distanceMap = distanceMap;
    }

    public Double findDistance(String srcCity, String destCity) {
        Map<String, Double> destinationMap = distanceMap.get(srcCity);
        if (destinationMap == null) {
            return null;
        }
        return destinationMap.get(destCity);
    }
}

