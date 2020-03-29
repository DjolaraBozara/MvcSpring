package rs.engineering.javacourse.myspringmvcapp.model;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class CompanyDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank(message = "Unesite ime")
	private String name;
	@NotBlank(message = "Unesite adresu")
	private String address;
	@NotBlank(message = "Unesite broj uluce")
	private String number;
	private CityDto cityDto;

	public CompanyDto() {
	}

	public CompanyDto(Long id, @NotBlank(message = "Unesite ime") String name,
			@NotBlank(message = "Unesite adresu") String address,
			@NotBlank(message = "Unesite broj uluce") String number, CityDto cityDto) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.cityDto = cityDto;
	}

	public CompanyDto(@NotBlank(message = "Unesite ime") String name,
			@NotBlank(message = "Unesite adresu") String address,
			@NotBlank(message = "Unesite broj uluce") String number, CityDto cityDto) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
		this.cityDto = cityDto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public CityDto getCityDto() {
		return cityDto;
	}

	public void setCityDto(CityDto cityDto) {
		this.cityDto = cityDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + ", cityDto="
				+ cityDto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cityDto == null) ? 0 : cityDto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDto other = (CompanyDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cityDto == null) {
			if (other.cityDto != null)
				return false;
		} else if (!cityDto.equals(other.cityDto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
