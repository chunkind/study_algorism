package sw.day02.sw1979;

import java.util.Scanner;

public class SW1979_어디에_단어가_들어갈수_있을까2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트의 수
		int[] result = new int[T];
		for(int a=0; a<T; a++) {
			int N = sc.nextInt(); //정사각형의 크기
			int[][] arr = new int[N][N];
			int cnt = 0;
			int searchCnt = 0;
			for(int b=0; b<N; b++) //입력
				for(int c=0; c<N; c++)
					arr[b][c] = sc.nextInt();
			for(int b=0; b<N; b++) {
				for(int c=0; c<N; c++) {
					if(arr[b][c] == 0) cnt = 0;
					if(arr[b][c] == 1) cnt++;
				}
				if(cnt == 3) searchCnt++;
				cnt = 0;
			}
			for(int b=0; b<N; b++) {
				for(int c=0; c<N; c++) {
					if(arr[c][b] == 0) cnt = 0;
					if(arr[c][b] == 1) cnt++;
				}
				if(cnt == 3) searchCnt++;
				cnt = 0;
			}
			result[a] = searchCnt;
		}
		for(int a=0; a<T; a++) {
			System.out.printf("#%d %d\n", a+1, result[a]);
		}
	}
}