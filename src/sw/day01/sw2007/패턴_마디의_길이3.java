package sw.day01.sw2007;

import java.util.Scanner;

public class 패턴_마디의_길이3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String s = sc.next();
			int wavelength = 0;
			for (int i = 1; i < 10; i++) {
				String sub = s.substring(0, i);
				String subNext = s.substring(i, i + i);
				if (sub.equals(subNext)) {
					wavelength = i;
					break;
				}
			}
			System.out.format("#%d %d\n", t, wavelength);
		}
	}
}
