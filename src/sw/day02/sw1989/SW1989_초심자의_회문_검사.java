package sw.day02.sw1989;

import java.util.Scanner;

/**
 * 
 */
public class SW1989_초심자의_회문_검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int a=0; a<T; a++) {
			String str = sc.next();
			boolean temp = false;
			Loof1 : for(int b=0; b<str.length(); b++) {
				for(int c=str.length()-1; c>=0; c--) {
					if(b==c) break Loof1;
					if(str.substring(b,b+1).equals(str.substring(c,c+1))) temp = true;
					else temp = false;
				}
			}
			System.out.println(temp);
		}
	}
}
