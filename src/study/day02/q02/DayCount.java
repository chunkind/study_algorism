package study.day02.q02;

import java.util.*;

public class DayCount{
	private Scanner sc = null;
	private int[][] mdays = null;
	private int year, month, day, days = 0;

	public void process(){
		sc = new Scanner(System.in);
		System.out.print("년 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		
		mdays = new int[][]{
			{31,29,31,30,31,30,31,31,30,31,30,31},
			{31,28,31,30,31,30,31,31,30,31,30,31}
		};
		for(int i=0; i<month-1; i++){
			days += mdays[isYun(year)][i];
		}
		days += day;
		System.out.println("경과일 : " + days);
	}

	public int isYun(int year){
		return (year%4==0 && year%100!=0 || year%400==0) ? 1:0;
	}
}
