
public class Software_Project extends Project{
	private int totalExperience;
	
	public Software_Project() {
		
	}

	public Software_Project(String engineerName, int totalProject,int totalExperience) {
		super(engineerName, totalProject);
		this.totalExperience=totalExperience;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	
}
