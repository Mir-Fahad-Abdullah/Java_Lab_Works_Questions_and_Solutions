
public class Student {
		String  name;
		int marks;
		double cgpa;
		
		public Student() {
			
		}


	public Student(String name, int id, double cgpa) {
		
			this.name = name;
			this.marks = id;
			this.cgpa = cgpa;
		}


	void min(Student[] arr) {
		int min=arr[0].marks,track=0;
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i].marks) {
				min=arr[i].marks;
				track=i;
			}
		}
		System.out.println("The minimum marks:"+min);
		System.out.println("Information of min marks holder:");
		System.out.println(arr[track].toString());
	}

	void sumAverage(Student[] arr) {
		int sumMarks=0;
		double sumCgpa=0;
		
		for(int i=0 ; i<arr.length ; i++) {
			sumMarks+=arr[i].marks;
			sumCgpa+=arr[i].cgpa;
		}
		double avgMarks=(double)sumMarks/arr.length;
		double avgCgpa=sumCgpa/arr.length;
		
		System.out.println("Sum marks:"+sumMarks+"\nSum Cgpa:"+sumCgpa+"\navegara marks:"+avgMarks+"\naverage cgpa:"+avgCgpa);
	}

		public String toString() {
			return "Student [name=" + name + ", id=" + marks + ", cgpa=" + cgpa + "]";
		}

}
