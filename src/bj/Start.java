package bj;

import java.util.Scanner;

public class Start{
	public static void main(String[] args){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.R2");
			System.out.println("2.설탕배달");
			System.out.println("3.하얀 칸");
			num = sc.nextInt();
			switch(num){
				case 1:
					Q3046 q3046 = new Q3046();
					q3046.process();
					break;
				case 2:
					Q2839 q2839 = new Q2839();
					q2839.process();
					break;
				case 3:
					Q1100 q1100 = new Q1100();
					q1100.process();
					break;
			}
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
		}while(num>0 && num<=3);
	}
}
