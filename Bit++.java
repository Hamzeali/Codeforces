import java.util.Scanner;
 
public class Bit++ {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 0;
		for(int i = 0; i < n; i++) {
			String s = in.next();
			if(s.equals("X++") || s.equals("++X"))
				x = x + 1;
			else if(s.equals("X--") || s.equals("--X"))
				x = x - 1;
		}
		System.out.println(x);
	}
	
}