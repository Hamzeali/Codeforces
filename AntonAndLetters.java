import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
	public class AntonAndLetters {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			ArrayList<Character> arr = new ArrayList<Character>();
			String s = in.nextLine();
			s = s.replaceAll("\\s+", "");
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != '{' && s.charAt(i) != '}' && s.charAt(i) != ',')
					arr.add(s.charAt(i));
			}
			Set<Character> a = new HashSet<Character>(arr);
			int x = a.size();
			System.out.println(x);
		}
	}