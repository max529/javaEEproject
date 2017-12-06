package ch.hevs.businessobject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@Entity
@Table(name="Professeurs")
public class Professor {
	
	//Values
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name="prénom")
	private String firstname;
	@Column(name="nom")
	private String lastname;	
	@Column(name="grade")
	private String role;
	
	//Relations
	@ManyToMany(mappedBy="professors", cascade = CascadeType.ALL)
	private List<ResearchProjects> researchProjects;
	
	@OneToMany(mappedBy="professor",cascade = CascadeType.ALL)
	private List<Courses> courses;
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public List<ResearchProjects> getResearchProjects() {
		return researchProjects;
	}
	public void setResearchProjects(List<ResearchProjects> researchProjects) {
		this.researchProjects = researchProjects;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	//Constructor
	public Professor() {
	}

	public Professor(String firstname, String lastname, String role) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		
	}
	
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("professor persisted!!!");
	}
	
	

}
