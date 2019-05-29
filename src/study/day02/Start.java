package study.day02;

import study.day02.q01.PrimeNumber;
import study.day02.q02.DayCount;

import java.util.*;

public class Start{

	public static void main(String[] args){
		int num = 0;
		int param = 0;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("입력한 수 : " + param);
		do{
			System.out.println("1.입력한 수 이하의 소수 구하기.");
			System.out.println("2.초과일 구하기.");
			num = sc.nextInt();
			switch(num){
				case 1:
					if(args.length == 0){
						System.out.println("인자를 넣으세요.");
						param = sc.nextInt();
					}else{
						param = Integer.parseInt(args[0]);
					}
					PrimeNumber p01 = new PrimeNumber();
					p01.process(param);
					break;
				case 2:
					DayCount p02 = new DayCount();
					p02.process();
					break;
			}
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
		}while(num>0 && num<3);
	}

}
