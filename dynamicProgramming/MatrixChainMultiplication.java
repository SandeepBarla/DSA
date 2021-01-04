package dynamicProgramming;

public class MatrixChainMultiplication {
	public static void main(String[] args) {
		int n=4; //No. of matrices
		int p[]= {5,4,6,2,7};
		int c[][]=new int[n+1][n+1];
		int ans[][]=new int[n+1][n+1];
		for(int d=1;d<4;d++) {
			for(int i=1;i<=n-d;i++) {
				int j=i+d,min=Integer.MAX_VALUE;
				for(int k=i;k<j;k++) {
					int l=c[i][k]+c[k+1][j]+(p[i-1]*p[k]*p[j]);
					if(l<min) {
						min=l;
						ans[i][j]=k;
					}	
				}
				c[i][j]=min;
			}
		}
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
