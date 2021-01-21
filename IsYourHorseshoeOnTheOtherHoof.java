import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
	public class IsYourHorseshoeOnTheOtherHoof {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0; i < 4; i++) {
				arr.add(in.nextInt());
			}
			int x = arr.size();
			Set<Integer> a = new HashSet<>(arr);
			int y = a.size();
			int result = x - y;
			System.out.println(result);
		}
	}