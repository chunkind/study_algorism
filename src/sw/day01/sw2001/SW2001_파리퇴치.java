package sw.day01.sw2001;

public class SW2001_파리퇴치 {
	static int t = 1;
	static int n = 5;
	static int m = 2;
	static int[][] arry = {
		{  1,  3,  3,  6,  7},
		{  8, 13,  9, 12,  8},
		{  4, 16, 11, 12,  6},
		{  2,  4,  1, 23,  2},
		{  9, 13,  4,  7,  3},
	};
	
	public static void main(String[] args) {
		for(int i=0; i<t; i++) {
			int max = 0;
			int sum = 0;
			for(int j=0; j<=n-m; j++)
				for(int k=0; k<=n-m; k++) {
					for(int l=0; l<m; l++)
						for(int o=0; o<m; o++)
							sum += arry[j+l][k+o];
					if(max < sum) max = sum;
					sum = 0;
				}
			System.out.printf("#%d %d", i+1, max);
		}
		
	}
}
