import java.util.*;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Book2
 *
 */
@Entity
public class Book2 {
@Id @GeneratedValue
private Long id;
private String title;
private Float price;
@Column(length = 500)
private String description;
private String isbn;
private Integer nbOfPage;
private Boolean illustrations;
//

	public Book2() {
		
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public Boolean getIllustrations() {
		return illustrations;
	}

	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
}
