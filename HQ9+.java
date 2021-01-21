import java.util.Scanner;
 
 
public class HQ9+ {
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			String s = input.next();
			if(s.contains("H") || s.contains("Q") || s.contains("9"))
			System.out.print("YES");
			else System.out.print("NO");
		}
	}