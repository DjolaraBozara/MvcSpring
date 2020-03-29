package rs.engineering.javacourse.myspringmvcapp.service;

import java.util.List;

import rs.engineering.javacourse.myspringmvcapp.model.CityDto;

public interface CityService<T> {
	void save(T cityDto);
	List<T> getAll();
	T findById(Long id);
}
