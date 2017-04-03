package Inheritance;

import javax.persistence.*;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "id",
	   column = @Column(name = "cd_id")),
	@AttributeOverride(name = "title",
	   column = @Column(name = "cd_title")),
	@AttributeOverride(name = "description",
	   column = @Column(name = "cd_description"))
	
})
public class CD extends Item{
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
	
	
	
	
}
