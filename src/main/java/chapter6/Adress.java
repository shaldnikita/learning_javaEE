package chapter6;

import javax.persistence.*;

@Entity
public class Adress {
	@Id @GeneratedValue
	private Long id;
	private String street;
	private String city;
	private String zipcode;
	private String country;

	public Adress() {

	}
	
	public Adress(String street,String city,String zipcode,String country){
		this.street=street;
		this.city=city;
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

	@Override
	public String toString() {
		return "Adress [id=" + id + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode + ", country="
				+ country + "]";
	}
	
}
