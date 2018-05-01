package com.sevice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevice.bean.Device;
import com.sevice.repository.CityRepository;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<Device> findAll() {

        List<Device> cities = (List<Device>) repository.findAll();
        
        return cities;
    }
}