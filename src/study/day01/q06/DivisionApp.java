package study.day01.q06;

import java.util.Scanner;

public class DivisionApp{
	public void process(){
		int no, dno, rno, size = 0;
		char[] d = new char[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수변환 합니다.");	
		do{
			do{
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			}while(no<=0);
			do{
				System.out.print("어떤 진수로 변환할까요?(2~36)");
				dno = sc.nextInt();
			}while(dno < 2 || dno >36);

			size = doit(no, dno, d);

			System.out.print("한번더 변환할까요?(1.예, 2.아니오)");
			rno = sc.nextInt();
		}while(rno == 1);
	}
	public int doit(int no, int dno, char[] d){
		String clist = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int digit = 0;
		int nam = 0;
		int noLength = ((Integer)no).toString().length();
		System.out.printf(String.format("%%2d  |  %%%dd\n", noLength), dno, no);
		do{
			System.out.printf("    +");
			for(int i=0; i<noLength+2; i++)
				System.out.print('-');
			System.out.println("");
			nam = no%dno;
			no /= dno;
			d[digit++] = clist.charAt(nam);
			if(no>=dno){
				System.out.printf(String.format("%%2d  |  %%%dd   ...   %%2d\n",noLength), dno, no, nam);
			}else{
				System.out.printf(String.format("       %%%dd   ...   %%2d\n",noLength), no, nam);
			}
			//System.out.printf(String.format("         %%%dd   ...   %%2d\n",noLength), no/dno, no%dno);
		}while(no >= dno);
		return digit;
	}
}
