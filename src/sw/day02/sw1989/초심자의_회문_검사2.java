package sw.day02.sw1989;

import java.util.Scanner;

public class 초심자의_회문_검사2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] arr = new String[t];
		for(int a=0; a<t; a++) {
			arr[a] = sc.next();
		}
		
		for(int a=0; a<t; a++) {
			boolean isEquals = false;
			int temp = arr[a].length()-1;
			for(int b=0; b<arr[a].length(); b++) {
				if(temp>=0) {
					if(b == temp) break;
					if(arr[b] == arr[temp]) {
						isEquals = true;
					}else {
						isEquals = false;
						break;
					}
					temp--;
				}
			}
			System.out.printf("#%d %d\n",a+1,isEquals==true? 1:0);
		}
	}
}
