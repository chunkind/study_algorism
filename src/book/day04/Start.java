package book.day04;

import java.util.Scanner;

import book.day04.q01.BinarySearchHistory;

public class Start{
//	public static void main(String[] args){
//		System.out.printf("%s" + String.format("%%%ds",4) + "%s","S","","E");
//		System.out.printf("%s" + String.format("%%%ds",4) + "%s","S"," ","E");
//	}

	public static void main(String[] args){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
			System.out.println("1.이진검색 이력남기기");
			num = sc.nextInt();
			switch(num){
				case 1:
					BinarySearchHistory p01 = new BinarySearchHistory();
					p01.process();
					break;
			}
		}while(num>0 && num<=1);
	}
}
