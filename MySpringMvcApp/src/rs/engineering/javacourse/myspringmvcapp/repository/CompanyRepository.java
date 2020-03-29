package rs.engineering.javacourse.myspringmvcapp.repository;

import java.util.List;

public interface CompanyRepository<T> {
	void save(T company);
	List<T> getAll();
	T findById(Long id);
	void remove(Long id);
	void edit(T company);
}

