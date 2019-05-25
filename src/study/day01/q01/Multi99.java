package study.day01.q01;

public class Multi99{
	public void process(){
		System.out.println("========곱셈표를 출력합니다========");
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		for(int i=1;i<=9;i++){
			System.out.print(" " + i + " |");
			for(int j=1;j<=9;j++){
				System.out.printf("%3d", i*j);
			}
			System.out.println("");
		}
	}
}
