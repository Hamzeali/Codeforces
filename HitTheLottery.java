import java.util.Scanner;
 
	public class HitTheLottery {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a = n;
			int count = 0;
			//1, 5, 10, 20, 100
			
			count += (n/100);
			n = n%100;
			count += (n/20);
			n = n%20;
			count += (n/10);
			n = n%10;
			count += (n/5);
			n = n%5;
			System.out.println(count + n);
			
		}
	}