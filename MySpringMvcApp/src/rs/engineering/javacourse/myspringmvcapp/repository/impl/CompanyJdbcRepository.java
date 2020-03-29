package rs.engineering.javacourse.myspringmvcapp.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import rs.engineering.javacourse.myspringmvcapp.domain.Company;

import rs.engineering.javacourse.myspringmvcapp.repository.CompanyRepository;

@Repository(value = "companyJdbcrepositroy")
public class CompanyJdbcRepository implements CompanyRepository<Company> {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CompanyJdbcRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Company company) {
		String query = "INSERT INTO company  (name,address,number,cityDto) VALUES(?,?,?,?)";
		jdbcTemplate.update(query, new Object[] { company.getName(), company.getAddress(), company.getNumber(),
				company.getCity().getNumber() });
	}

	@Override
	public List<Company> getAll() {

		return null;
	}

	@Override
	public Company findById(Long id) {

		return null;
	}

	@Override
	public void remove(Long id) {

	}

	@Override
	public void edit(Company company) {

	}

}
