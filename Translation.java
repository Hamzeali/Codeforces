import java.util.Scanner;
 
	public class Translation {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			String t = in.next();
			char c[] = new char[s.length()];
			for(int i = 0; i < c.length; i++) {
				c[i] = s.charAt(i);
			}
			String ss = "";
			for(int i = c.length-1; i >= 0; i--) {
				ss = ss + c[i];
			}
			if(t.equals(ss))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	