package ch.hevs.businessobject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@Entity
@Table(name="Eleves")
public class Students extends Person{
	
	//Values
	private int number;
	
	
	//Relations
	
	
	//Get and Set
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//Constructor
	public Students() {
	}
	
	public Students(String firstname, String lastname) {
		super(lastname, firstname);
		
		
	}
	
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("students persisted!!!");
	}
	
	

}

