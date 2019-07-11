package sw.day01.sw2001;

import java.util.Scanner;

public class SW2001_파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arry = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
            	int num = 0;
            	while(true) {
            		num = sc.nextInt();
            		if(num > 0 && num < 30) break;
            	}
            	arry[i][j] = num; 
            	System.out.printf("arry[%d][%d] : %d\n", i, j, num);
            }
        }
        
        for(int i=0; i<arry.length; i++) {
			for(int j=0; j<arry[i].length; j++) {
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}
		for(int i=0; i<T; i++) {
			int max = 0;
			int sum = 0;
			for(int j=0; j<=N-M; j++)
				for(int k=0; k<=N-M; k++) {
					for(int l=0; l<M; l++)
						for(int o=0; o<M; o++)
							sum += arry[j+l][k+o];
					if(max < sum) max = sum;
					sum = 0;
				}
			System.out.printf("#%d %d\n", i+1, max);
		}
	}
}