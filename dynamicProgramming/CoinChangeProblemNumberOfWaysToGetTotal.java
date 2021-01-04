package dynamicProgramming;

public class CoinChangeProblemNumberOfWaysToGetTotal {
	public static void main(String args[]) {
		int m = 15;
		int c[] = { 0, 2, 3, 5, 10 };
		int n = c.length-1;
		int a[][] = new int[n+1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j == 0) {
					a[i][j] = 1;
				} else {
					if (c[i] > j) {
						a[i][j] = a[i - 1][j];
					}else {
						a[i][j]=a[i-1][j]+a[i][j-c[i]];
					}
				}
			}
		}
		System.out.println(a[n][m]);
	}

}
