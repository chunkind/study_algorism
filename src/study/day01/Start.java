package study.day01;

import study.day01.q01.Multi99;
import study.day01.q02.TriangleLB;
import study.day01.q03.NumberTriangle;
import study.day01.q04.ReverseArray;
import study.day01.q05.CardConvRev;
import study.day01.q06.DivisionApp;
import study.day01.q07.P3046;

import java.util.*;

public class Start{
    public static void main(String[] args){
		int num = 0;
		int param = 0;

		if(args.length == 0){
			param = 7;
		}else{
			param = Integer.parseInt(args[0]);
		}

		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("실행할 프로그램을 선택 하세요.");
			System.out.println("1.곱셈표");
			System.out.println("2.삼각형");
			System.out.println("3.숫자삼각형");
			System.out.println("4.배열뒤집기");
			System.out.println("5.기수변환");
			System.out.println("6.기수변환프로그램");
			System.out.println("7.백준 P3046");
			num = sc.nextInt();
			switch(num){
				case 1:
					Multi99 proc1 = new Multi99();
					proc1.process();
					break;
				case 2:
					TriangleLB proc2 = new TriangleLB();
					proc2.process();
					break;
				case 3:
					NumberTriangle proc3 = new NumberTriangle();
					proc3.process(param);
					break;
				case 4:
					ReverseArray proc4 = new ReverseArray();
					proc4.process();
					break;
				case 5:
					CardConvRev proc5 = new CardConvRev();
					proc5.process();	
					break;
				case 6:
					DivisionApp proc6 = new DivisionApp();
					proc6.process();
					break;
				case 7:
					P3046 proc7 = new P3046();
					proc7.process();
					break;
			}
		}while(num<1 || num>7);
    }
}




















