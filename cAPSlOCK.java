import java.util.Scanner;
 
	public class cAPSlOCK {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			char c[] = s.toCharArray();
			int a = s.length();
			int count = 0;
			for(int i = 0; i < c.length; i++) {
				if(Character.isUpperCase(c[i]))
					count++;
			}
			if((count == a-1 && Character.isLowerCase(c[0]))) {
				s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
			}
			else if(count == a)
				s = s.toLowerCase();
			System.out.println(s);
		}
	}