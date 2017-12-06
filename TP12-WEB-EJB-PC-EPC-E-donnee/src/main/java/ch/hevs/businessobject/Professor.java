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
public class Professor extends Person{
	
	//Values

	@Column(name="salaire")
	private double salary;
	
	//Relations
	@ManyToMany(mappedBy="professors", cascade = CascadeType.ALL)
	private List<ResearchProjects> researchProjects;
	
	@OneToMany(mappedBy="professor",cascade = CascadeType.ALL)
	private List<Courses> courses;
	
	//Get and Set
	
	
	public List<ResearchProjects> getResearchProjects() {
		return researchProjects;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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

	public Professor(String firstname, String lastname, double salary) {
		super(lastname, firstname);
		this.salary = salary;
		
	}
	
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("professor persisted!!!");
	}
	
	

}
