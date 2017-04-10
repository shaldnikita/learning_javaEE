package chapter6;

import javax.persistence.EntityManager;
import javax.persistence.Inheritance;
import javax.persistence.PersistenceUnit;
import Inheritance.*;
@Stateless
public class BookEJB {
	@PersistenceUnit(unitName = "AppWebPU")
	private EntityManager em;
	
	public void createBook(){
		Book book = new Book();
		book.setTitle("title1");
		em.persist(book);
	}
}
