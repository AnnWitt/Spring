package com.michalszalkowski.module.car.repository;

import com.michalszalkowski.module.car.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CarRepository extends JpaRepository<CarEntity, Long>, JpaSpecificationExecutor<CarEntity> {
}

