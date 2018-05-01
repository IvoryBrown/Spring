package com.sevice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sevice.bean.Device;

@Repository
public interface CityRepository extends CrudRepository<Device, Long> {

}