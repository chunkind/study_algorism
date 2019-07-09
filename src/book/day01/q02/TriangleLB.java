package book.day01.q02;

import java.util.*;

public class TriangleLB{
    public void process(){
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        do{
            System.out.println("몇단 삼각형 입니까?");
            a = sc.nextInt();
        }while(a<=0);

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}   
