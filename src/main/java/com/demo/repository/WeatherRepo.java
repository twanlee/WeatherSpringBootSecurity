package com.demo.repository;

import com.demo.model.Weather;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepo extends PagingAndSortingRepository<Weather,Long> {
}
