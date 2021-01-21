import java.util.Scanner;
 
public class Drinks {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			sum = sum + a[i];
		}
		double res = sum/n;
		System.out.println(res);
		
	}
}