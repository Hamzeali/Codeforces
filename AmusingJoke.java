import java.util.Arrays;
import java.util.Scanner;
 
	public class AmusingJoke {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s1 = in.next();
			String s2 = in.next();
			String s12 = s1 + s2;
			String s3 = in.next();
			char c12[] = s12.toCharArray();
			char c3[] = s3.toCharArray();
			Arrays.sort(c12);
			Arrays.sort(c3);
			int a = c12.length;
			int b = c3.length;
			int count = 0;
			if(a == b) {
				for(int i = 0; i < c12.length; i++) {
					if(c12[i] == c3[i])
						count++;
				}
				if(count == a)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}
			else
				System.out.println("NO");
		}
	}