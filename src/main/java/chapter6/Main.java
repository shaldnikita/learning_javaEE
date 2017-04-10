package chapter6;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppWebPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Adress adress = new Adress("street","city","zipcode","country");
		Customer customer = new Customer("firstName","lastName","email",adress);
		
		tx.begin();
		em.persist(customer);
		tx.commit();
		
		
		tx.begin();
		Query a = em.createQuery("SELECT NEW chapter6.Adress(c.street,c.city,c.zipcode,c.country) FROM Customer c");
		Adress newAdress  = (Adress)a.getSingleResult();
		System.out.println(newAdress);
		tx.commit();
	
		em.close();
		emf.close();
	}

}
