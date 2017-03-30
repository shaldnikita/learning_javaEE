import java.util.*;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity
@NamedQueries({ @NamedQuery(name = "findAllBooks", query = "SELECT b from Book b"),
		@NamedQuery(name = "findBookH2G2", query = "SELECT b from Book b WHERE b.title = 'H2G2'") })
public class Book {
	@Id
	@GeneratedValue
	private Long Id;
	private String title;
	private Float price;
	private String description;
	private String isbn;
	private Integer nbOfPage;
	private Boolean illustrations;
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "Tag")
	@Column(name = "value")
	private List<String> tags;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@JoinColumn(name = "order_fk")
	private List<BookPage> pages;

	public Book() {
		super();
	}

	public Book(Long Id, String title, String description, float price, int nbOfPage, String isbn,
			boolean illustrations,ArrayList<String> tags,ArrayList<BookPage> pages) {
		this.tags=tags;
		this.Id = Id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.nbOfPage = nbOfPage;
		this.isbn = isbn;
		this.illustrations = illustrations;
		this.pages=pages;

	}

	public long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
