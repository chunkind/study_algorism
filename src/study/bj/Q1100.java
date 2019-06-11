package study.bj;

public class Q1100{
	public void process(){
		char[][] arry = {
			{'.', 'F', '.', 'F', '.', '.', '.', 'F'},
			{'F', '.', '.', '.', 'F', '.', 'F', '.'},
			{'.', '.', '.', 'F', '.', 'F', '.', 'F'},
			{'F', '.', 'F', '.', '.', '.', 'F', '.'},
			{'.', 'F', '.', '.', '.', 'F', '.', '.'},
			{'F', '.', '.', '.', 'F', '.', 'F', '.'},
			{'.', 'F', '.', 'F', '.', 'F', '.', 'F'},
			{'.', '.', 'F', 'F', '.', '.', 'F', '.'},
		};

		int cnt = 0;
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry[i].length; j++){
				if((i+j)%2==0 && (arry[i][j]=='F')) cnt++;
			}
		}

		System.out.println("cnt : " + cnt);

	}
}
