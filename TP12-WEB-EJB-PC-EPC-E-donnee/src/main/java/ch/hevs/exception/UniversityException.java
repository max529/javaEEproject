package ch.hevs.exception;

public class UniversityException extends RuntimeException{
	
	public UniversityException() {
		super();
	}

	public UniversityException(String arg0) {
		super(arg0);
	}

	public UniversityException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UniversityException(Throwable arg0) {
		super(arg0);
	}

}
