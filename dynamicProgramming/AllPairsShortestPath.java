package dynamicProgramming;

import java.util.*;

public class AllPairsShortestPath {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;

		int a[][] = 
				{{ 0,  0, 0, 0, 0 }, {0, 0,  5,  max, 10}, 
                    {0,max, 0,   3, max}, 
                    {0,max, max, 0,   1}, 
                    {0,max, max, max, 0} 
                  };
		
			
//			{ { 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, max, 7 }, { 0, 8, 0, 2, max }, { 0, 5, max, 0, 1 },
//				{ 0, 2, max, max, 0 } };

		for (int k = 1; k <= 4; k++) {
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
//					if (k != i && k != j && i == j) {
//					System.out.print(a[i][j]+ " ");
						if (a[i][j] > a[i][k] + a[k][j]) {
							a[i][j] = a[i][k] + a[k][j];
						}
//					}
				}
			}
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}