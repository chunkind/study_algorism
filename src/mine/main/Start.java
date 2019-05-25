package main;

import chap02.*;

import java.util.*;

public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ReverseArray test = new ReverseArray();
		//int[] arry = {1,2,3,4,5};
		//System.out.println("service start.....");
		//System.out.println("셔플전 배열의 값 : " + Arrays.toString(arry));
		//test.reverse(arry);
        //System.out.println("셔플후 배열의 값 : " + Arrays.toString(arry));
		
		CardConvRev test = new CardConvRev();
		char[] a = null;
		System.out.print("input d : ");
		int d = sc.nextInt();
		System.out.print("input r : ");
		int r = sc.nextInt();
        System.out.println("d = " + d + ", r = " + r );
		a = test.cardConvR(d, r, a);
		System.out.println("a = "+Arrays.toString(a));
	}
}
