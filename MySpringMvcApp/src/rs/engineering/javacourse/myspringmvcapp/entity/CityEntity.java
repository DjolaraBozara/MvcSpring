package rs.engineering.javacourse.myspringmvcapp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "city")
public class CityEntity implements Serializable {
	private static final long serialVersionUID = 2151959395889955260L;
	@Id
	private Long number;
	
	private String name;
	
	public CityEntity() {
	}
	
	public CityEntity(Long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [number=" + number + ", name=" + name + "]";
	}
	
}
