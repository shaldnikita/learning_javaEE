package chapter6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Main {

	public static void main(String[] args) {
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppWebPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Adress adress = new Adress("street","city","zipcode","country");
		Adress adress1 = new Adress("street1","city3","zipcode1","country1");
		Adress adress2 = new Adress("street2","city3","zipcode2","country2");
		Adress adress3 = new Adress("street","city3","zipcode3","country3");
		Customer customer = new Customer("Jack","Black","JB@gmail.ru",adress);
		Customer customer1 = new Customer("Alex","White","AW@gmail.ru",adress1);
		Customer customer2 = new Customer("Nick","Miller","Miller@gmail.ru",adress2);
		Customer customer3 = new Customer("John","Green","Jhonny@gmail.ru",adress3);
		
		tx.begin();
		em.persist(customer);
		em.persist(customer1);
		em.persist(customer2);
		em.persist(customer3);
		tx.commit();
		
		
		tx.begin();
		TypedQuery<Long> a = em.createQuery("SELECT count(c) FROM Customer c GROUP BY c.adress.street HAVING c.adress.street = 'street' ",Long.class);
		a.getResultList().stream().forEach(System.out::println);
		tx.commit();
		
		
		
		
		em.close();
		emf.close();
	}

}
