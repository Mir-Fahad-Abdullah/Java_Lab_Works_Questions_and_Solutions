
public class Hardware_Project extends Software_Project{
	private String designation;
	
	public Hardware_Project() {
		
	}

	public Hardware_Project(String engineerName, int totalProject, int totalExperience,String designation) {
		super(engineerName, totalProject, totalExperience);
		this.designation=designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String[] engineer(Software_Project[] arr1, Hardware_Project[] arr2) {
		int i,j,count=0;
		int sum=0;
		String[] engName=new String[arr1.length];
		for(i=0 ; i<arr1.length ; i++) {
			for(j=0 ; j<arr2.length ; j++) {
			if(arr1[i].getEngineerName()==arr2[j].getEngineerName()) {
				engName[i]=arr1[i].getEngineerName();
				sum=arr1[i].getTotalProject()+arr2[j].getTotalProject();
				count++;
				}
			}
		}
		double avg=(double)sum/count;
		
		System.out.println("The average :"+avg);
		
		return engName;
	}
}
