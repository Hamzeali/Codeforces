import java.util.*;
 
 
public class TheatreSquare {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		long n, m, a;
		
		n = input.nextLong();
		m = input.nextLong();
		a = input.nextLong();
		
		System.out.println(((n + a - 1  ) / a) * ((m + a - 1) / a));
	}
}