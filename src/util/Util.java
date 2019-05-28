package util;

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
	
}
