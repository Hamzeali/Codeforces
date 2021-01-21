import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
	public class HolidayOfEquality {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				arr.add(in.nextInt());
			}
			Collections.sort(arr);
			int counter = 0;
			for(int i = 0; i < n-1; i++) {
				counter += (arr.get(n-1) - arr.get(i));
			}
			System.out.println(counter);
		}
	}