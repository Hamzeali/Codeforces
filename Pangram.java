import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
	
	public class Pangram {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String s = in.next();
			s = s.toLowerCase();
			ArrayList<Character> ar = new ArrayList<Character>();
			for(int i = 0; i < n; i++) {
				ar.add(s.charAt(i));
			}
			Set<Character> a = new HashSet<>(ar);
			int size = a.size();
			if(size == 26)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}