package book.day03.q01;

import java.util.Scanner;

/**
 * 선형검색
 */
public class SeqSearch {
	public void process(){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		
		//배열 크기 지정
		//int[] x = new int[num];
		int[] x = new int[num+1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값：");//키 값을 입력
		int ky = stdIn.nextInt();

		//배열x에서 키 값이 ky인 요소를 검색
		//int idx = seqSearch(x, num, ky);
		//int idx = seqSearch2(x, num, ky);
		int idx = seqSearch3(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
	}

	//배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색 
	public int seqSearch1(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			if (i == n) return -1;//검색 실패
			if (a[i] == key) return i;//검색 성공
			i++;
		}
	}
	//for문을 사용하여 코드간소화
	public int seqSearch2(int[] a, int n, int key){
		for(int i=0; i<n; i++)
			if(a[i] == key) return i; //검색성공
		return -1; //검색 실패
	}
	//보초법
	public int seqSearch3(int[] a, int n, int key){
		int i = 0;
		a[n] = key; //보초를 추가
		while(true){
			if(a[i]==key){
				break;
			}
			i++;
		}
		return i==n? -1:i;
	}
}
