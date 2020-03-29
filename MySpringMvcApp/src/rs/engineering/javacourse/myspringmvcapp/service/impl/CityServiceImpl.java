package rs.engineering.javacourse.myspringmvcapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.engineering.javacourse.myspringmvcapp.domain.City;
import rs.engineering.javacourse.myspringmvcapp.entity.CityEntity;
import rs.engineering.javacourse.myspringmvcapp.model.CityDto;
import rs.engineering.javacourse.myspringmvcapp.repository.CityRepository;
import rs.engineering.javacourse.myspringmvcapp.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService<CityDto> {
	private final CityRepository<CityEntity> cityRepository;

@Autowired
	
	public CityServiceImpl(@Qualifier(value = "cityJpaRepository")CityRepository<CityEntity> cityRepository) {
		this.cityRepository = cityRepository;
	}
@Override
public void save(CityDto cityDto) {
	CityEntity city = new CityEntity(cityDto.getNumber(), cityDto.getName());
	cityRepository.save(city);	
}
@Override
public List<CityDto> getAll() {
	List<CityEntity> cities = cityRepository.getAll();
	List<CityDto> citiesDto = new ArrayList<CityDto>();
	for(CityEntity c: cities) {
		citiesDto.add(new CityDto(c.getNumber(), c.getName()));
	}
	return citiesDto;
}
@Override
public CityDto findById(Long id) {
	CityEntity city = cityRepository.findById(id);
	return new CityDto(city.getNumber(), city.getName());
}
}


	
	

