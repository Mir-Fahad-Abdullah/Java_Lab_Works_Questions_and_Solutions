public class Task3 {

	public static void main(String[] args) {
		int[][] num= {{3,4,9},{2,9,11},{4,6,0}};
		int i,j;
		int rowSum, colSum, majDiaSum=0 , minDiaSum=0;
		
		for(i=0 ; i<3 ; i++) {
			rowSum=0;
			for(j=0 ; j<3 ; j++) {
				rowSum+=num[i][j];
			}
			System.out.println("The sum of row "+(i+1)+":"+rowSum);
		}
		
		for(j=0 ; j<3 ; j++) {
			colSum=0;
			for(i=0 ; i<3 ; i++) {
				colSum+=num[i][j];
			}
			System.out.println("The sum of column "+(j+1)+":"+colSum);
		}
		
		for(i=0 ; i<3 ; i++) {
			majDiaSum+=num[i][i];
		}
		System.out.println("The sum of major diagonal:"+majDiaSum);
		
		for(i=0 ; i<3 ; i++) {
			minDiaSum+=num[i][2-i];
		}
		System.out.println("The sum of minor diagonal:"+minDiaSum);
	}

}
