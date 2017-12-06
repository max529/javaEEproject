package ch.hevs.bankservice;

import java.util.List;

import javax.ejb.Local;

import ch.hevs.businessobject.Courses;
import ch.hevs.businessobject.Professor;
import ch.hevs.businessobject.ResearchProjects;
import ch.hevs.businessobject.Students;

@Local
public interface University {
	
	//affichage
	Courses getCourses();
	
	ResearchProjects getReasearchProjects();
	
	List<Professor> getProfessor();
	
	List<Students> getStudents();
	
	//affichage avec paramètre
	
	ResearchProjects getResearchProjectsBySubject(String subject);
	
	
	
	
	

}
