package criteriaApi;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipseLnk")
@StaticMetamodel(Customer.class)
public class Customer_ {
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, String> firstName;
	public static volatile SingularAttribute<Customer, String> lastName;
	public static volatile SingularAttribute<Customer, Integer> age;
	public static volatile SingularAttribute<Customer, String> email;
	public static volatile SingularAttribute<Customer, Adress> adress;
}
