import java.util.ArrayList;

public abstract class University {
	private double cgpa;
	
	public University() {
		
	}
	
	public University(double cgpa) {
		super();
		this.cgpa = cgpa;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public abstract void fCreate() throws Exception;
	public abstract void fWrite(Students[] arr , ArrayList<Integer> marks) throws Exception; 
}
