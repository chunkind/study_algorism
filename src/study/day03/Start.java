package study.day03;

import study.day03.q01.SeqSearch;

import java.util.*;

public class Start{
	public static void main(String[] args){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("실행할 프로그램 번호를 입력 하세요.");
			System.out.println("1.선형검색 보초법.");
			num = sc.nextInt();
			switch(num){
				case 1:
					SeqSearch p01 = new SeqSearch();
					p01.process();
					break;
			}
		}while(num>0 && num<=1);
	}
}
