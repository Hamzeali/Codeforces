import java.util.Scanner;
 
public class PetyaAndStrings {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int a = s1.compareToIgnoreCase(s2);
		if(a > 0)
			a = 1;
		else if(a < 0)
			a = -1;
		System.out.println(a);
		
	}
}