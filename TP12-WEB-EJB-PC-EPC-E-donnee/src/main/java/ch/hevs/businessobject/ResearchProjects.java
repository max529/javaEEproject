package ch.hevs.businessobject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@Entity
@Table(name="Projet de Recherche")
public class ResearchProjects {
	
	//Values
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name="nom")
	private String name;
	@Column(name="sujet")
	private String subject;	
	@Column(name="description")
	private String description;
	
	//Relations
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Professor> professors;
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	//Constructor
	public ResearchProjects() {
		
	}
	public ResearchProjects(String name, String subject, String description) {
		this.name = name;
		this.subject = subject;
		this.description = description;
		
	}
	@PostPersist
	public void acknowledgePersist() {
		System.out.println("ResearchProject persisted!!!");
	}
	
	
	

}

