package ch.hevs.businessobject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@Entity
@Table(name="Cours")
public class Courses {
	
	//Values
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name="nom")
	private String name;
	@Column(name="nombre")
	private int number;	
	@Column(name="obligatoire")
	private boolean obligatory;
	
	//Relations
	@ManyToOne(cascade = CascadeType.ALL)
	private Professor professor;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Students> students;
	
	//Get and Set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isObligatory() {
		return obligatory;
	}
	public void setObligatory(boolean obligatory) {
		this.obligatory = obligatory;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	//Constructor
	public Courses() {
	}
	public Courses(String name, int number, boolean obligatory) {
		this.name = name;
		this.number = number;
		this.obligatory = obligatory;
		
	}
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("Courses persisted!!!");
	}
	
	
	

}
