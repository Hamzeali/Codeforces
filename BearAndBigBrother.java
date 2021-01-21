import java.util.Scanner;
 
public class BearAndBigBrother {
	
	public static void main(String[] args) {
		
		start();
	}
 
	private static void start() {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		calculate(a, b);
		input.close();
	}
 
	private static void calculate(int a, int b) {
		if(1 <= a && a <= b && b <= 10){
			int i = 0;
			while(true){
				a = a * 3;
				b = b * 2;
				i++;
				if(a > b){
					break;
				}
			}
			System.out.println(i);
		}
	}
 
}