package study.day01.q04;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray{
	public void swap(int[] arry, int idx1, int idx2){
		int temp = 0;
		temp = arry[idx1];
		arry[idx1] = arry[idx2];
		arry[idx2] = temp;
	}
	public void process(int[] arry){
		int rCnt = arry.length;
		int cCnt = rCnt/2;
		for(int i=0; i<cCnt; i++){
			swap(arry, i, (rCnt-1)-i);
		}
	}
	public void process(){
		int[] temp = {1,2,3,4,5};
		this.process(temp);
	}
}
