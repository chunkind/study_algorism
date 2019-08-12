package sw.d2.day05.sw3499;

import java.util.Scanner;

public class 퍼펙트셔플 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			String[] map = new String[n];
			String[] smap = new String[n];
			for(int i=0; i<n; i++)
				map[i] = sc.next();
			for(int i=0; i<n; i++) {
				if(i%2==0) smap[i] = map[i/2];
				else smap[i] = map[((n-i)/2)+i];
			}
			System.out.printf("#%d", tc);
			for(int i=0; i<n; i++)
				System.out.printf(" %s", smap[i]);
			System.out.println();
		}
	}
}
