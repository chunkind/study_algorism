package bj;

import java.util.Scanner;

public class Q2839{
	public void process(){
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do{
			System.out.println("봉지에 담을 양을 넣으세요");
			num = sc.nextInt();
		}while(num<3 || num>5000);
	}
}
