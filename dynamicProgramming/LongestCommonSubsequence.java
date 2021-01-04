package dynamicProgramming;
import java.util.*;
public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String b="ABCDGH";
		String a="AEDFHR";
		int n=b.length();
		int m=a.length();
		int x[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(b.charAt(i-1)==a.charAt(j-1)) x[i][j]=1+x[i-1][j-1];
				else {
					x[i][j]=Math.max(x[i-1][j],x[i][j-1]);
				}
			}
		}
		for(int[] i:x) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("Length of Longest Common Subsequence is "+x[n][m]);
		int i=n,j=m;
		System.out.println(i+" "+j);

		ArrayList<Character> l=new ArrayList<>();
		while(i>0 && j>=0) {
			if(x[i][j]==x[i-1][j]) {
				i--;
			}else if(x[i][j]==x[i][j-1]) {
				j--;
			}else {
				i--;j--;
				System.out.println(i+" "+j);
				l.add(b.charAt(i));
			}
		}
		Collections.reverse(l);
		System.out.println(l);
	}
}
