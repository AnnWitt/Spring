package com.michalszalkowski.module.car;

import com.michalszalkowski.module.car.mapper.dto.CarDto;
import com.michalszalkowski.module.car.mapper.CarMapper;
import com.michalszalkowski.module.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/api/cars/{guid}")
	public CarDto getCar(@PathVariable String guid) {
		return CarMapper.map(carService.getOne(guid));
	}

	@GetMapping("/api/cars")
	public List<CarDto> getCars(
		@RequestParam(required = false) String color,
		@RequestParam(required = false) String make,
		@RequestParam(required = false) Long year)

		{
		return CarMapper.map(carService.getAll(color,make,year));
	}

}
