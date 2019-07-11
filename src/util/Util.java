package util;

import java.util.Scanner;

public class Util{
	//int 배열 추가
	public static int[] addIntArr(int[] orgArr, int n){
		if(null == orgArr){
			orgArr = new int[1];
			orgArr[0] = n;
			return orgArr;
		}
		int[] cpArr = orgArr;
		int orgSize = orgArr.length;
		orgArr = new int[orgSize+1];
		for(int i=0; i<orgSize; i++){
			orgArr[i] = cpArr[i];
		}
		orgArr[orgSize] = n;
		return orgArr;
	}	

	//int 배열 출력.
	public static void printIntArr(int[] arrInt){
		System.out.println("==start list==");
		for(int i=0; i<arrInt.length; i++){
			System.out.println(arrInt[i]);
		}
		System.out.println("==end list==");
	}
	
	public static int[] getInputArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수 입력");
		int n = sc.nextInt();
		int[] result = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("입력 값 입력");
			result[i] = sc.nextInt();
		}
		return result;
	}
	
}
