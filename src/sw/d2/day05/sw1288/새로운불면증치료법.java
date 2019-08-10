package sw.d2.day05.sw1288;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 새로운불면증치료법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			Set<Integer> list = new HashSet<Integer>();
			int[] map = new int[10];
			int cnt = 1;
			while(true) {
				String str = (cnt * n)+"";
				char[] numlist = str.toCharArray();
				for(int i=0; i<numlist.length; i++) {
					int c = Integer.parseInt(numlist[i]+"");
					map[c] = c;
					list.add(c);
				}
				cnt++;
				if(list.size() == 10) {
					System.out.printf("#%d %s\n", tc, str);
					break;
				}
			}
		}
	}
}