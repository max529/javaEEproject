package ch.hevs.bankservice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import ch.hevs.businessobject.Courses;
import ch.hevs.businessobject.Professor;
import ch.hevs.businessobject.ResearchProjects;
import ch.hevs.businessobject.Students;

public class UniversityBean implements University {
	
	@PersistenceContext(name = "University_PU", type=PersistenceContextType.EXTENDED)
	private EntityManager em;

	@Override
	public Courses getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResearchProjects getReasearchProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professor> getProfessor() {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Professor").getResultList();
	}

	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Students").getResultList();
	}

	@Override
	public ResearchProjects getResearchProjectsBySubject(String subject) {
		// TODO Auto-generated method stub
		return (ResearchProjects)em.createQuery("From ResearchProjects r where r.subject=:subject").setParameter("id", subject).getSingleResult();
	}

}
