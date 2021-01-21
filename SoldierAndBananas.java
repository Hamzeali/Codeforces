import java.util.Scanner;
 
 
public class SoldierAndBananas {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int k, n, w;
			int p = 0;
			k = input.nextInt();
			n = input.nextInt();
			w = input.nextInt();
			
			for(int i = 1; i <= w; i++){
				p = p + (i*k);
			}
			if(p > n)
				System.out.println(p - n);
			else System.out.println(0);
		}
	}