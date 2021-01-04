package dynamicProgramming;

public class MultiStageGraph {

	public static void main(String[] args) {
//		int stages=5;
//		int vertices=12;
		int Cost[][]= {
				{0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,9,7,3,2,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,4,2,1,0,0,0,0},
				{0,0,0,0,0,0,2,7,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,11,0,0,0,0},
				{0,0,0,0,0,0,0,11,8,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,6,5,0,0},
				{0,0,0,0,0,0,0,0,0,4,3,0,0},
				{0,0,0,0,0,0,0,0,0,0,5,6,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,4},
				{0,0,0,0,0,0,0,0,0,0,0,0,2},
				{0,0,0,0,0,0,0,0,0,0,0,0,5},
				{0,0,0,0,0,0,0,0,0,0,0,0,0}
		};
//		for(int i=0;i<13;i++) {
//			for(int j=0;j<13;j++) {
//				System.out.print(Cost[i][j]+" ");
//			}
//			System.out.println();
//		}
		int c[]=new int[13];
		int d[]=new int[13];
		int p[]=new int[6];
		
		c[12]=0;
		d[12]=12;
		for(int i=11;i>=1;i--) {
			int min=Integer.MAX_VALUE;
			for(int j=i+1;j<=12;j++) {
				if(Cost[i][j]!=0 && c[j]+Cost[i][j]<min) {
					min=c[j]+Cost[i][j];
					d[i]=j;
				}
			}
			c[i]=min;
		}
		p[1]=1;
		p[5]=12;
		System.out.print(p[1]+" ");
		for(int i=2;i<6;i++) {
			p[i]=d[p[i-1]];
			System.out.print(p[i]+" ");
		}
		
	}

}
