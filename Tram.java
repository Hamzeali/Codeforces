import java.util.Scanner;
 
public class Tram {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			res = res - a;
			max = Math.max(max, res);
			res = res + b;
			max = Math.max(max, res);
		}
		System.out.println(max);
	}
}