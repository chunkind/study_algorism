package study.day02;

import study.day02.q01.PrimeNumber;

import java.util.*;

public class Start{

	public static void main(String[] args){
		int num = 0;
		int param = 0;
		Scanner sc = new Scanner(System.in);
		if(args.length == 0){
			System.out.println("숫자를 입력하세요");
			param = sc.nextInt();
		}else{
			param = Integer.parseInt(args[0]);
		}

		System.out.println("입력한 수 : " + param);
		do{
			System.out.println("1.입력한 수 이하의 소수 구하기.");
			num = sc.nextInt();
			switch(num){
				case 1:
					PrimeNumber p01 = new PrimeNumber();
					p01.process(param);
					break;
			}
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
		}while(num>0 && num<2);
	}

}
