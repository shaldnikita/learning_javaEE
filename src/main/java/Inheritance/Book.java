package Inheritance;

import javax.persistence.*;

@Entity
public class Book extends Item {
	@Id @GeneratedValue
	private Long id;
	private String isbn;
	private String publisher;
	private Integer nbOfPage;
	private Boolean illustrations;

	public Book() {
	}

	public Book(String isbn, String publisher, Integer nbOfPage, Boolean illustrations) {
		super();
		this.isbn = isbn;
		this.publisher = publisher;
		this.nbOfPage = nbOfPage;
		this.illustrations = illustrations;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
