package rs.engineering.javacourse.myspringmvcapp.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import rs.engineering.javacourse.myspringmvcapp.entity.CityEntity;
import rs.engineering.javacourse.myspringmvcapp.repository.CityRepository;

@Repository(value = "cityJpaRepository")
@Transactional(propagation = Propagation.MANDATORY)
public class CityJpaRepository implements CityRepository<CityEntity> {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void save(CityEntity city) {
		entityManager.persist(city);
	}

	@Override
	public List<CityEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityEntity findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager.find(CityEntity.class, id);
	}

	@Override
	public List<CityEntity> getAll() {
		return entityManager.createQuery("SELECT c FROM city c").getResultList();
	}



}
