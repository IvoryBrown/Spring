package com.sevice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sevice.bean.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}