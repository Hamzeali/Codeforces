import java.util.Arrays;
import java.util.Scanner;
 
	public class RestoringThreeNumbers {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a[] = new int[4];
			for(int i = 0; i < 4; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for(int i = 0; i < 3; i++) {
				System.out.print(a[a.length-1] - a[i] + " ");
			}
		}
	}