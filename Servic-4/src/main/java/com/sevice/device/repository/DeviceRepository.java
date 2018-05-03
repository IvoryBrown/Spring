package com.sevice.device.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sevice.device.bean.Device;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {

}