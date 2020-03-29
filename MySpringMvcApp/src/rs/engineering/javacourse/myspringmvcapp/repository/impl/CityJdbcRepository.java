package rs.engineering.javacourse.myspringmvcapp.repository.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import rs.engineering.javacourse.myspringmvcapp.domain.City;
import rs.engineering.javacourse.myspringmvcapp.entity.CityEntity;
import rs.engineering.javacourse.myspringmvcapp.repository.CityRepository;

@Repository
public class CityJdbcRepository implements CityRepository<CityEntity>{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CityJdbcRepository(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(CityEntity city) {
	String query = "INSERT INTO  city VALUES(?,?)";
	jdbcTemplate.update(query, city.getNumber(),city.getName());
		
	}

	@Override
	public List<CityEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityEntity findById(Long id) {
		String query = "SELECT * FROM city WHERE number=?";
		
		return jdbcTemplate.queryForObject(query, new Object[] {id},(ResultSet rs, int rowNo)->{
			CityEntity cityEn = new CityEntity();
			cityEn.setName(rs.getString("name"));
			cityEn.setNumber(rs.getLong("number"));
			
			return cityEn;
		}
		
				);
	}

	@Override
	public List<CityEntity> getAll() {
	String query = "SELECT * FROM city";
	
		return  jdbcTemplate.query(query, (ResultSet rs, int rowNo)->{
			CityEntity cityEn = new CityEntity();
			cityEn.setName(rs.getString("name"));
			cityEn.setNumber(rs.getLong("number"));
			return cityEn;
		});
		
	}



}
