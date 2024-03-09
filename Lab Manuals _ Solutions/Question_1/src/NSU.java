
public class NSU {
	public String[] ECE(String[] gender , String[] names , int marks[]){
		int sum=0,count_odd=0;
		int i;
		for(i=0 ; i<marks.length ; i++) {
			if(gender[i].equalsIgnoreCase("male") && marks[i]%2!=0 && marks[i]>60) {
				sum+=marks[i];
				count_odd++;
			}
		}
		double avg=(double)sum/count_odd;
		
		System.out.println("The sum of all male students who got above 60:"+sum);
		System.out.println("The average of all male students who got above 60:"+avg);
		
		String[] fNames=new String[marks.length];
		
		for(i=0 ; i<marks.length ; i++) {
			if(marks[i]%2==0 && gender[i].equalsIgnoreCase("female")) {
				fNames[i]=names[i];
			}
		}
		
		return fNames;
	}
}
