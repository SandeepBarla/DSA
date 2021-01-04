package dynamicProgramming;

public class OptimalBinarySearchTree {
	public static void main(String[] args) {
		int n=4;
//		int v[]= {0,10,12,20};
		int f[]= {0,4,2,6,3};
		int w[][]= new int[n+1][n+1];
		
		int c[][]=new int[n+1][n+1];
		int r[][]=new int[n+1][n+1];
		
		for(int d=1;d<=n;d++) {
			for(int i=0;i<=n-d;i++) {
				int min=Integer.MAX_VALUE;
				int j=i+d;
				w[i][j]=w[i][j-1]+f[j];
				for(int k=i+1;k<=j;k++) {
					if(c[i][k-1]+c[k][j]<min) {
						min=c[i][k-1]+c[k][j];
						c[i][j]=min+w[i][j];
						r[i][j]=k;
					}
				}
			}
		}
		for(int i[]:c) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Minimum cost is: "+c[0][n]);
	}

}
