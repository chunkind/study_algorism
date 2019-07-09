package sw.day01.sw2005;

import java.util.Scanner;

public class SW2005_파스칼삼각형 {
	static Scanner sc = new Scanner(System.in);
	static int t = 0;
	static int[][] arry = null;
	static int[] n = null;
	
	public static void main(String[] agrs) {
		//값입력
		intputValue();
		
		for(int q=0; q<n.length; q++) {
			arry = new int[n[q]][n[q]];
			// 입력.
			for (int i = 0; i < arry.length; i++) {
				for (int j = 0; j < arry[i].length; j++) {
					arry[i][j] = getCnt(i-1, j-1) + getCnt(i-1, j); 
					if(i == j) break;
				}
			}
			// 출력.
			System.out.println("#" + (q+1));
			for (int i = 0; i < arry.length; i++) {
				for (int j = 0; j < arry[i].length; j++) {
					System.out.printf("%s%s", arry[i][j] == 0 ? " " : arry[i][j], " ");
				}
				System.out.println();
			}
		}
		
	}
	
	public static void intputValue() {
		do {
			System.out.println("1이상 10이하 정수를 입력.");
			t = sc.nextInt();
			n = new int[t];
		} while (t > 11 || t < 1);

		for(int i=0; i<t; i++) {
			System.out.println("정삼각형의 길이를 입력.");
			n[i] = sc.nextInt();
		}
	}
	
	public static int getCnt(int x, int y) {
		try {
			if(x < 0 && y < 0)
				return 1;
			else
				return arry[x][y];
		}catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}
}
