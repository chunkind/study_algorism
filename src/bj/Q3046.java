package bj;

import java.util.Scanner;

public class Q3046{
	public void process(){
		Scanner sc = new Scanner(System.in);

		int r1 = 0;
		int r2 = 0;
		int s = 0;

		do{
			System.out.print("input r1(11) : ");
			r1 = sc.nextInt();
			System.out.print("input s(15) : ");
			s = sc.nextInt();
		}while(r1 < -1000 || r1 > 1000 || s < -1000 || s > 1000);

		r2 = 2*s - r1;
		System.out.println("r2 : " + r2);

	}
}
