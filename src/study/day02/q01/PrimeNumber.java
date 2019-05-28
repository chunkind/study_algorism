package study.day02.q01;

import util.Util;

public class PrimeNumber{
	private int[] arrInt;
	private int divCnt;
	public void process(int param){
		//this.myLogic(param);
		this.logic2(param);
		System.out.println("총 연산 갯수 : " + divCnt);
		Util.printIntArr(arrInt);
	}

	public void myLogic(int param){
		int cnt = 0;
		for(int i=1; i<=param; i++){
			for(int j=1; j<=i; j++){
				divCnt++;
				if(i%j == 0){
					cnt += 1;	
				}
			}
			if(cnt==2){
				arrInt = Util.addIntArr(arrInt, i);
			}
			cnt = 0;
		}
	}

	public void logic2(int param){
		for(int i=2; i<param; i++){
			int j;
			for(j=2; j<i; j++){
				divCnt++;
				if(i%j==0) break;
			}
			if(i==j) arrInt = Util.addIntArr(arrInt, i);
		}
	}

}
