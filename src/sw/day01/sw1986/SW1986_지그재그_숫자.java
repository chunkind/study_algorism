package sw.day01.sw1986;

public class SW1986_지그재그_숫자 {
	static int[] input = {2, 5, 6};
	static int[] output = new int[input[0]];
	
	public static void main(String[] args) {
		for(int i=1; i<=input[0]; i++) {
			if(input[i] < 1 || input[i]>10) {
				System.out.println("n은 1이상 10이하");
				break;
			}
			for(int j=1; j<=input[i]; j++) {
				if((j%2)==0) output[i-1] += -j;
				else output[i-1] += j;
			}
		}
		
		//출력
		for(int i=0; i<output.length; i++) {
			System.out.printf("#%d %d\n", i+1, output[i]);
		}
	}
	
}
