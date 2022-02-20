package com.michalszalkowski.module.car.repository;

import com.michalszalkowski.module.car.entity.CarEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CarPagingAndSortingRepository extends PagingAndSortingRepository<CarEntity, Long> {
    }

