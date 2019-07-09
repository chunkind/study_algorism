package book.day02;

import java.util.Scanner;

import book.day02.q01.PrimeNumber;
import book.day02.q02.DayCount;
import book.day02.q03.DaysLeft;

public class Start{

	public static void main(String[] args){
		int num = 0;
		int param = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.입력한 수 이하의 소수 구하기.");
			System.out.println("2.초과일 구하기.");
			System.out.println("3.남은일 구하기.");
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
				case 3:
					DaysLeft p03 = new DaysLeft();
					p03.process();
					break;
			}
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
		}while(num>0 && num<=3);
	}

}
