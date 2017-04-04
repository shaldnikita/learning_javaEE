package Inheritance;

import javax.persistence.*;

@Entity
public class CD extends Item{
	@Id @GeneratedValue
	private Long id;
	private String musicCompany;
	private Integer numberOfCDs;
	private Float totalDuration;
	private String genre;
	
	
	public CD(){
	}
	
	public CD(String musicCompany, Integer numberOfCDs, Float totalDuration, String genre) {
		super();
		this.musicCompany = musicCompany;
		this.numberOfCDs = numberOfCDs;
		this.totalDuration = totalDuration;
		this.genre = genre;
	}

	public String getMusicCompany() {
		return musicCompany;
	}

	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}

	public Integer getNumberOfCDs() {
		return numberOfCDs;
	}

	public void setNumberOfCDs(Integer numberOfCDs) {
		this.numberOfCDs = numberOfCDs;
	}

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
