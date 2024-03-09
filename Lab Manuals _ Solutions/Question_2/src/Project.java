
public class Project {
	private String engineerName;
	private int totalProject;
	
	public Project(){
		
	}

	public Project(String engineerName, int totalProject) {
		super();
		this.engineerName = engineerName;
		this.totalProject = totalProject;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public int getTotalProject() {
		return totalProject;
	}

	public void setTotalProject(int totalProject) {
		this.totalProject = totalProject;
	}
	
}
