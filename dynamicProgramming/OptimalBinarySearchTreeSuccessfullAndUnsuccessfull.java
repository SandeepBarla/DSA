package dynamicProgramming;

public class OptimalBinarySearchTreeSuccessfullAndUnsuccessfull {
	public static void main(String[] args) {
		int v[]= {0,10,20,30,40};
		int p[]= {0,3,3,1,1};
		int q[]= {2,3,1,1,1};
		int n=v.length-1;
		int r[][]=new int[n+1][n+1];
		int c[][]=new int[n+1][n+1];
		int w[][]=new int[n+1][n+1];
		for(int d=0;d<=n;d++) {
			for(int i=0;i<=n-d;i++) {
				int j=i+d;
				if(d==0) w[i][j]=q[i];
				else{w[i][j]=w[i][j-1]+p[j]+q[j];}
				int min=Integer.MAX_VALUE;
				for(int k=i+1;k<=j;k++) {
					if(c[i][k-1]+c[k][j]<min) {
						min=c[i][k-1]+c[k][j];
						c[i][j]=min+w[i][j];
						r[i][j]=k;
					}
				}
			}
		}
		for(int i[]:w) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Minimum cost is: "+r[0][n]);
	}
}
