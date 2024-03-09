
public class Calculation {
	
	public void allSum(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8, double c1,double c2,double c3,double c4,double c5,double c6,double c7,double c8) {
		int totalMarks=0;
		double totalCgpa=0;
		
		totalMarks=n1+n2+n3+n4+n5+n6+n7+n8;
		totalCgpa= c1+c2+c3+c4+c5+c6+c7+c8;
		
		System.out.println("Total marks:"+totalMarks+"\nTotal cgpa:"+totalCgpa);
		
		double avgCgpa=allAverage(totalMarks,totalCgpa);
		System.out.println("The average of all students cgpa:"+avgCgpa);
	}
	
	public double allAverage(int tMarks , double tCgpa) {
		double avgMarks=(double)tMarks/8;
		double avgCgpa=tCgpa/8;
		System.out.println("The average of all student marks:"+avgMarks);
		return avgCgpa;
	}
	
	public int evenSum(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8, double c1,double c2,double c3,double c4,double c5,double c6,double c7,double c8) {
		
		int sumEven=0, even=0;
		
		if(n1%2==0) {
			sumEven+=n1;
			even++;
		}
		if(n2%2==0) {
			sumEven+=n2;
			even++;
		}
		if(n3%2==0) {
			sumEven+=n3;
			even++;
		}
		if(n4%2==0) {
			sumEven+=n4;
			even++;
		}
		if(n5%2==0) {
			sumEven+=n5;
			even++;
		}
		if(n6%2==0) {
			sumEven+=n6;
			even++;
		}
		if(n7%2==0) {
			sumEven+=n7;
			even++;
		}
		if(n8%2==0) {
			sumEven+=n8;
			even++;
		}
		
		double avgEven=(double)sumEven/even;
		
		System.out.println("The avgrage of all even marks:"+avgEven);
		
		return sumEven;
	}
	
	public double oddSum(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8, double c1,double c2,double c3,double c4,double c5,double c6,double c7,double c8) {
		
		int sumOdd=0, odd=0;
		
		if(n1%2!=0) {
			sumOdd+=n1;
			odd++;
		}
		if(n2%2!=0) {
			sumOdd+=n2;
			odd++;
		}
		if(n3%2!=0) {
			sumOdd+=n3;
			odd++;
		}
		if(n4%2!=0) {
			sumOdd+=n4;
			odd++;
		}
		if(n5%2!=0) {
			sumOdd+=n5;
			odd++;
		}
		if(n6%2!=0) {
			sumOdd+=n6;
			odd++;
		}
		if(n7%2!=0) {
			sumOdd+=n7;
			odd++;
		}
		if(n8%2!=0) {
			sumOdd+=n8;
			odd++;
		}
		
		double avgOdd=(double)sumOdd/odd;
		
		System.out.println("The sum of all odd marks :"+sumOdd);
		
		return avgOdd;
	}
	
}
