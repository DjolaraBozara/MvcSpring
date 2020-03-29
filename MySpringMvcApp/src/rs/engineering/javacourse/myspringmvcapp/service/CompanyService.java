package rs.engineering.javacourse.myspringmvcapp.service;

import java.util.List;

import rs.engineering.javacourse.myspringmvcapp.domain.Company;

public interface CompanyService<T> {
	void save(T companyDto);
	List<T> getAll();
	T findById(Long id);
	void remove(Long id);
	Company get(Long id);
}
