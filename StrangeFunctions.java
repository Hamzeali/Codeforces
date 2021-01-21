import java.util.Scanner;
 
public class StrangeFunctions {		
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				String s = in.next();
				System.out.println(s.length());
			}
		}
	}