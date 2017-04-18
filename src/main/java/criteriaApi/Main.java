package criteriaApi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppWebPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		Adress adress = new Adress("street", "city", "zipcode", "country");
		Adress adress1 = new Adress("street1", "city3", "zipcode1", "country1");
		Adress adress2 = new Adress("street2", "city3", "zipcode2", "country2");
		Adress adress3 = new Adress("street", "city3", "zipcode3", "country3");
		Customer customer = new Customer("Jack", "Black", 21, "JB@gmail.ru", adress);
		Customer customer1 = new Customer("Alex", "White", 38, "AW@gmail.ru", adress1);
		Customer customer2 = new Customer("Nick", "Miller", 13, "Miller@gmail.ru", adress2);
		Customer customer3 = new Customer("John", "Green", 40, "Jhonny@gmail.ru", adress3);

		tx.begin();
		em.persist(customer);
		em.persist(customer1);
		em.persist(customer2);
		em.persist(customer3);
		tx.commit();

		// CriteriaAPI
		// CriteriaBuilder builder = em.getCriteriaBuilder();
		// CriteriaQuery<Customer> criteriaQuery =
		// builder.createQuery(Customer.class);
		// Root<Customer> c = criteriaQuery.from(Customer.class);
		// criteriaQuery.select(c).where(builder.greaterThan(c.get(Customer_.age),
		// 35));
		// TypedQuery<Customer> query = em.createQuery(criteriaQuery);
		// List<Customer> cust = query.getResultList();

		// NamedStoredProcedure
		// StoredProcedureQuery query =
		// em.createNamedStoredProcedureQuery("updateAge");
		// query.setParameter("cAge", 45);
		// query.setParameter("cName", "John");

		// Using remote procedure w/o name
		// StoredProcedureQuery query =
		// em.createStoredProcedureQuery("updateBooks");
		// query.registerStoredProcedureParameter("age", Integer.class,
		// ParameterMode.IN);
		// query.registerStoredProcedureParameter("name", String.class,
		// ParameterMode.IN);
		// query.setParameter("name", "John");
		// query.setParameter("age", 15);

		tx.begin();
		// query.execute();
		tx.commit();

		em.close();
		emf.close();
	}

}
