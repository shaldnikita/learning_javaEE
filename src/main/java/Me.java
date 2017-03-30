import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Me {
	@EmbeddedId
	private MyId id;
	@Column(name = "my_number")
	private String number;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirthday;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinColumn(name = "add_fk", nullable = false)
	private Adress adress;
	@Enumerated(EnumType.STRING)
	private CreditCardType cct;

	public Me(MyId id,CreditCardType cct, Date doB, String number, Adress adress) {
		this.id=id;
		this.cct = cct;
		this.dateOfBirthday = doB;
		this.number = number;
		this.adress = adress;
	}

	public Me() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public MyId getId() {
		return id;
	}

	public void setId(MyId id) {
		this.id = id;
	}

}
