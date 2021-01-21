import java.util.Scanner;
 
	public class Word {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			int upper = 0;
			int lower = 0;
			for(int i = 0; i < s.length(); i++) {
				if(Character.isUpperCase(s.charAt(i)))
					upper++;
				else lower++;
			}
			if(upper > lower)
				s = s.toUpperCase();
			else
				s = s.toLowerCase();
			System.out.println(s);
		}
	}