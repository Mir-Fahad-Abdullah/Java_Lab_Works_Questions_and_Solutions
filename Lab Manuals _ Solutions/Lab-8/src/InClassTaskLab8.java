import java.util.Scanner;

public class InClassTaskLab8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[][] matrix1=new int[3][2];
		int[][] matrix2=new int[3][2];
		int i,j;
		
		System.out.println("Enter the elements of first matrix:");
		for(i=0 ; i<3 ; i++) {
			for(j=0 ; j<2 ; j++) {
				System.out.print("Element ["+(i)+"]["+(j)+"] :");
				matrix1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix:");
		for(i=0 ; i<3 ; i++) {
			for(j=0 ; j<2 ; j++) {
				System.out.print("Element ["+(i)+"]["+(j)+"] :");
				matrix2[i][j]=scan.nextInt();
			}
		}
		
		
		int[] m1ColumnSum=new int[2];
		int[] m1RowSum=new int[3];
		int[] m2ColumnSum=new int[2];
		int[] m2RowSum=new int[3];
		
		for(i=0 ; i<3 ; i++) {
			m1RowSum[i]=0;
			for(j=0 ; j<2 ; j++) {
				m1RowSum[i]+=matrix1[i][j];
			}
		}
		
		for(j=0 ; j<2 ; j++) {
			m1ColumnSum[j]=0;
			for(i=0 ; i<3 ; i++) {
				m1ColumnSum[j]+=matrix1[i][j];
			}
		}
		
		for(i=0 ; i<3 ; i++) {
			m2RowSum[i]=0;
			for(j=0 ; j<2 ; j++) {
				m2RowSum[i]+=matrix2[i][j];
			}
		}
		
		for(j=0 ; j<2 ; j++) {
			m2ColumnSum[j]=0;
			for(i=0 ; i<3 ; i++) {
				m2ColumnSum[j]+=matrix2[i][j];
			}
		}
		
		for(i=0 ; i<3 ; i++) {
			if(i==1) {
				double avgRow1=(double)m1RowSum[i]+m2RowSum[i]/2;
				System.out.println("The sum of row "+i+" of matrix 1 is:"+m1RowSum[i]+"\nThe sum of row "+i+" of matrix 2 is:"+m2RowSum[i]);
				System.out.println("The average of row 1 of both matrix:"+avgRow1);
			}
		}
		for(i=0 ; i<2 ; i++) {
			if(i==1) {
				double avgCol1=(double)m1ColumnSum[i]+m2ColumnSum[i]/2;
				System.out.println("The sum of column "+i+" of matrix 1 is:"+m1ColumnSum[i]+"\nThe sum of column "+i+" of matrix 2 is:"+m2ColumnSum[i]);
				System.out.println("The average of column1 of both matrix:"+avgCol1);
			}
		}
			
	}

}
