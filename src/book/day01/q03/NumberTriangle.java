package book.day01.q03;

public class NumberTriangle{

	public int calcul(int n){
		return (n-1)*2 + 1;
	}

	public void process(int c){
		int input = c;
		int total = calcul(input);
		
		for(int i=0; i<input; i++){
			int starSpace = calcul(i+1);
			int emptySpace = (total - starSpace)/2;
			int printChar = i%10;
			for(int j=0; j<emptySpace; j++){
				System.out.print(" ");
			}
			for(int j=0; j<starSpace; j++){
				System.out.print(printChar);
			}
			for(int j=0; j<emptySpace; j++){
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
