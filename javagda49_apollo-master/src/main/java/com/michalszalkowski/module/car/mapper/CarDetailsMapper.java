package com.michalszalkowski.module.car.mapper;

import com.michalszalkowski.module.car.dto.CarDetailsDto;
import com.michalszalkowski.module.car.entity.CarDetailsEntity;

public class CarDetailsMapper {

	public static CarDetailsDto map(CarDetailsEntity details) {
		if (details == null) {
			return new CarDetailsDto();
		}
		return new CarDetailsDto()
				.setFirstName(details.getFirstName())
				.setLastName(details.getLastName());
	}
}

