package Inheritance;
import javax.persistence.*;

@MappedSuperclass
public class Item {
	
	private Long id;
	@Column(length = 50, nullable = false)
	private String title;
	private Float price;
	@Column(length = 2000)
	private String description;
	
	public Item(){
	}
	
	public Item(String title, Float price, String description) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
