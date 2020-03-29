package rs.engineering.javacourse.myspringmvcapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rs.engineering.javacourse.myspringmvcapp.domain.City;
import rs.engineering.javacourse.myspringmvcapp.domain.Company;
import rs.engineering.javacourse.myspringmvcapp.entity.CityEntity;
import rs.engineering.javacourse.myspringmvcapp.model.CityDto;
import rs.engineering.javacourse.myspringmvcapp.model.CompanyDto;
import rs.engineering.javacourse.myspringmvcapp.repository.CompanyRepository;
import rs.engineering.javacourse.myspringmvcapp.service.CompanyService;

@Service
@Transactional
public class CompanuServiceImpl implements CompanyService<CompanyDto> {
	private final CompanyRepository<Company> companyRepository;

	public CompanuServiceImpl(@Qualifier("companyJpaRepository") CompanyRepository<Company> companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public void save(CompanyDto companyDto) {
		CityEntity city = new CityEntity(companyDto.getCityDto().getNumber(), companyDto.getCityDto().getName());
		Company company = new Company(companyDto.getId(), companyDto.getName(), companyDto.getAddress(),
				companyDto.getNumber(), city);
		companyRepository.save(company);
	}

	@Override
	public List<CompanyDto> getAll() {
		List<Company> companies = companyRepository.getAll();
		List<CompanyDto> companiesDtos = new ArrayList<CompanyDto>();
		for (Company c : companies) {
			CityDto cityDto = new CityDto(c.getCity().getNumber(), c.getCity().getName());
			companiesDtos.add(new CompanyDto(c.getId(), c.getName(), c.getAddress(), c.getNumber(), cityDto));
		}
		return companiesDtos;
	}

	@Override
	public CompanyDto findById(Long id) {
		Company c = companyRepository.findById(id);
		CityDto cityDto = new CityDto(c.getCity().getNumber(), c.getCity().getName());
		return new CompanyDto(c.getId(), c.getName(), c.getAddress(), c.getNumber(), cityDto);

	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		companyRepository.remove(id);

	}

	@Override
	public Company get(Long id) {
		return companyRepository.findById(id);
	}

}
