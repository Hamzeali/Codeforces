import java.util.Arrays;
import java.util.Scanner;
 
	public class TheNewYearMeetingFriends {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a[] = new int[3];
			for(int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			int ans = (a[1] - a[0]) + (a[2] - a[1]);
			System.out.println(ans);
		}
	}