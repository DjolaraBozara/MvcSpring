package rs.engineering.javacourse.myspringmvcapp.repository;
import java.util.List;

import rs.engineering.javacourse.myspringmvcapp.domain.City;

public interface CityRepository<T> {
	void save(T city);
	List<T> findAll();
	//kako resiti ako je ID razlicitog tipa, negde string, negde Long, negde slozeni tip
	T findById(Long key);
	List<T> getAll();
}
