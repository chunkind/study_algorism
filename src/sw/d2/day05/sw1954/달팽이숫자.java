package sw.d2.day05.sw1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이숫자 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			int cnt = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i%4 == 1)
						map[i][j] = ++cnt;
//					else if()
				}
			}
			System.out.printf("#%d\n",tc);
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++)
					System.out.printf("%d ", map[i][j]);
				System.out.println();
			}
					
		}
	}
}