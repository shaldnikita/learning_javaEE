
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import Inheritance.*;
public class Main {

	public static void main(String[] args) {
		/*Book book = new Book(2050L, "H2G2", "Автостопом по галактике", 12.5f, 354, "1 - 84023 - 742 - 2", false,
				new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5", "6", "7" })),
				new ArrayList<BookPage>(Arrays.asList(new BookPage[] { new BookPage("page 1"), new BookPage("page 2"),
						new BookPage("page 3"), new BookPage("page 4") })));*/
		
		// Me me = new Me(new MyId("Nikita", "Shaldenkov"), CreditCardType.VISA,
		// new Date(Calendar.getInstance().getTimeInMillis()), "89175586982",
		// new Adress("Olonetskaya", "Moscow", "Moscow", "112233", "Russia"));

		// List<OrderLine> list = Arrays.asList(new OrderLine[]{new
		// OrderLine("book", 1200.0, 2),
		// new OrderLine("shoes", 900.0, 3), new OrderLine("Food", 100.0, 1)});
		// Order order = new Order(null);

		/*
		 * Artist artist = new Artist("Tim", "Mcilrath", new
		 * ArrayList<CD>(Arrays.asList(new CD[]{ new CD("first", 100F,
		 * "first cd"), new CD("second", 150F, "second cd") }))); Artist artist1
		 * = new Artist("Egor", "Letov", new ArrayList<CD>(Arrays.asList(new
		 * CD[]{ new CD("Моя оборона", 1000F, "оооо моя оборона"), new
		 * CD("Моя оборона2", 1000F, "оооо моя оборона2") })));
		 * artist1.getAppearsOnCDs().get(0).setCreatedByArtists(new
		 * ArrayList<Artist>( Arrays.asList(new Artist[]{artist})));
		 */
		/*News news = new News("NEWS1", new ArrayList<Comment>(Arrays.asList(new Comment[] {
				new Comment("1", "content1", new Integer(1), new Date(Calendar.getInstance().getTimeInMillis())),
				new Comment("2", "content2", new Integer(2), new Date(Calendar.getInstance().getTimeInMillis())),
				new Comment("3", "content3", new Integer(3), new Date(Calendar.getInstance().getTimeInMillis())) })));*/
		
		Inheritance.Book book = new Inheritance.Book();
		book.setTitle("title1");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppWebPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(book);
		//em.persist(cd);
		tx.commit();


		em.close();
		emf.close();
	}

}
