package study.day03.q02;

import java.util.*;

public class BinarySearch{
	private Scanner sc = new Scanner(System.in);

	public void process(){
		System.out.println("요솟수 : " );
		int num = sc.nextInt();
		int[] x = new int[num];
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		for(int i=1; i<num; i++){
			do{
				System.out.print("x[" + i + "]:");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}

		System.out.print("검색할 값 :");
		int key = sc.nextInt();

		//구현.....
		int idx = binSearch(x, num, key);

		if(idx == -1){
			System.out.println("그 값의 요소가 없습니다");
		}else{
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다");
		}
	}

	//아래 메서드를 구현
	//a => 정렬된 숫자 배열
	//n => 배열 length
	//key => 찾을 숫자
	public int binSearch(int[] a, int n, int key){
		return -1;
	}
}
