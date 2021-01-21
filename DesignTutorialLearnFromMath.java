import java.util.Scanner;
 
	public class DesignTutorialLearnFromMath {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			System.out.println(n % 2 == 0? 8 + " " + (n-8): 9 + " " + (n-9));
		}
	}