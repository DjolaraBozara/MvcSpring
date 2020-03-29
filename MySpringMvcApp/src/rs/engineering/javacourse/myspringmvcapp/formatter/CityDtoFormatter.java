package rs.engineering.javacourse.myspringmvcapp.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import rs.engineering.javacourse.myspringmvcapp.model.CityDto;
import rs.engineering.javacourse.myspringmvcapp.service.CityService;

public class CityDtoFormatter implements Formatter<CityDto>{
	
	
	private CityService<CityDto>  cityService;
	
	
	public CityDtoFormatter() {
	
	}

	@Override
	public String print(CityDto cityDto, Locale locale) {
	
		return cityDto.getNumber().toString();
	}

	@Override
	public CityDto parse(String cityNumber, Locale locale) throws ParseException {
				return  cityService.findById(Long.parseLong(cityNumber));
	}
	@Autowired
	public void setCityService(CityService<CityDto> cityService) {
		this.cityService = cityService;
	}


}
