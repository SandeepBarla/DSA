package dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class MinimunNumberOfCoins {
	public static void main(String[] args) {
		int m = 11;
		int c[] = { 0, 1, 5, 6, 9 };
		int n = 4;
		int a[][] = new int[n + 1][m + 1];
		int t[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
//				if(j==0 && i!=0) a[i][j]=0;
				if (i == 0)
					a[i][j] = Integer.MAX_VALUE-1;
				else if (i == 1) {

					if (j % c[i] == 0)
						a[i][j] = j / c[i];
					else
						a[i][j] = a[i - 1][j];

				} else if (c[i] > j) {
					a[i][j] = a[i - 1][j];
				} else {
					if(a[i - 1][j] < 1 + a[i][j - c[i]]) a[i][j] =a[i - 1][j] ;
					else if(a[i - 1][j] > 1 + a[i][j - c[i]]) a[i][j] =1 + a[i][j - c[i]];
					else {
						t[i][j]++;
						a[i][j] =1 + a[i][j - c[i]];
					}
				}
			}
		}
		for(int i[]:a) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		ArrayList<Integer> l=new ArrayList<>();
		int i = n, j = m;
		while (i > 0 && j >=0) {
			if (a[i][j] == a[i - 1][j] ) {
				System.out.println(c[i]+" is not included");
				l.add(0);
				i--;
			}
			else {
				System.out.println(c[i]+" is included");
				l.add(1);
				j=j-c[i];
				i--;
			}
		}
		Collections.reverse(l);
		System.out.println(l);
		System.out.println();
		if(t[n][m]>0) {
			l.clear();
			i=n;j=m;
			while (i > 0 && j >=0) {
				if (a[i][j] == a[i - 1][j] && t[i][j]==0) {
					System.out.println(c[i]+" is not included");
					l.add(0);
					i--;
				}
				else {
					System.out.println(c[i]+" is included");
					l.add(1);
					j=j-c[i];
					i--;
				}
			}
			Collections.reverse(l);
			System.out.println(l);
		}
		System.out.println();
		System.out.println("Minimum number of coins are: "+a[n][m] +" in "+ (t[n][m]+1) +" ways");

	}
}
