package study.day02.q01;

import util.Util;

public class PrimeNumber{
	private int[] arrInt;
	private int divCnt;

	public void process(int param){
		this.myLogic(param);
		//this.logic2(param);
		//this.logic3(param);
		Util.printIntArr(arrInt);
		System.out.println("총 연산 갯수 : " + divCnt);
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
		arrInt = Util.addIntArr(arrInt, 2);
		boolean temp = true;
		for(int i=3; i<param; i+=2){
			for(int j=1; j<arrInt.length; j++){
				divCnt++;
				if(i%arrInt[j]==0){
					temp = false;
					break;
				}
			}
			if(temp){
				arrInt = Util.addIntArr(arrInt, i);
			}else{
				temp = true;
			}
		}
	}

	public void logic3(int param){
		arrInt = Util.addIntArr(arrInt, 2);
		arrInt = Util.addIntArr(arrInt, 3);
		for(int i=5; i<param; i+=2){
			boolean flag = false;
			for(int j=1; (arrInt[j]*arrInt[j])<=i; i++){
				divCnt += 2;
				if(i%arrInt[j]==0){
					flag = true;
					break;
				}
			}
			if(!flag){
				arrInt = Util.addIntArr(arrInt, i);
				divCnt++;
			}
		}
	}

}




































