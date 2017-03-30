import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	public Adress() {

	}
	
	public Adress(String street,String city,String state,String zipcode,String country){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.country=country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street1) {
		this.street = street1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
