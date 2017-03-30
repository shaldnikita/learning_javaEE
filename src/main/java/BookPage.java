import javax.persistence.*;

@Entity
@Table(name="book_page")
public class BookPage {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="text_on_page",nullable=false)
	private String text;
	
	public BookPage(){
	}
	
	public BookPage(String text){
		this.text=text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
