package com.michalszalkowski.module.car;



//---

//import com.michalszalkowski.module.car.dto.CarDto;
import com.michalszalkowski.module.car.entity.CarEntity;
import com.michalszalkowski.module.car.mapper.CarMapper;
import com.michalszalkowski.module.car.mapper.dto.CarDto;
import com.michalszalkowski.module.car.repository.CarPagingAndSortingRepository;
import com.michalszalkowski.module.core.pagination.ListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarControllerV2 {

	@Autowired
	private CarPagingAndSortingRepository repository;

	@GetMapping("/api/v2/cars")
	public ListResponse<CarDto> getCars(
			@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "size", defaultValue = "10") int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<CarEntity> carPage = repository.findAll(pageable);

		return new ListResponse(
				CarMapper.map(carPage.getContent()),
				carPage.getTotalPages(),
				carPage.getTotalElements(),
				carPage.getSize(),
				carPage.getNumber()
		);

	}
}