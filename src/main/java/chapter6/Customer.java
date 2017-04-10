package chapter6;

import javax.persistence.*;

@Entity
public class Customer {
	@Id @GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	@OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name = "adress_fk")
	private Adress adress;
	
	public Customer(){
		
	}
	
	public Customer(String firstName, String lastName, String email, Adress adress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", adress=" + adress + "]";
	}
	
	
	
}
