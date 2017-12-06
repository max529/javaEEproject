package ch.hevs.businessobject;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Person {
	
	//Values
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int id;
		private String firstname;
		private String lastname;	
	
	
	//Get and Set
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	
	//Constructor
	public Person() {
	}
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		
	}
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("Courses persisted!!!");
	}
	
	
	

}

