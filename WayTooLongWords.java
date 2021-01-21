import java.util.Scanner;
 
public class WayTooLongWords {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = 0;
		for(int i = 0; i < x; i++) {
			String s = in.next();
			n = s.length();
			if(n > 10) {
				String s1 = s.substring(0, 1);
				String s2 = s.substring(s.length() - 1, s.length());
				String s3 = s1.concat(n-2 + s2);
				System.out.println(s3);
				}
			else
				System.out.println(s);
		}
	}
}