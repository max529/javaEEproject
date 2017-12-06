package ch.hevs.bankservice;

import javax.ejb.Local;

import ch.hevs.businessobject.Courses;
import ch.hevs.businessobject.Professor;
import ch.hevs.businessobject.ResearchProjects;

@Local
public interface University {
	Courses getCourses();
	ResearchProjects getReasearchProjects();
	Professor getProfessor();
	
	
	
	
	

}
