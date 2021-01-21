import java.util.Scanner;
 
public class BoyOrGirl {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int len = s.length();
		int j = 0;
		char[] c = new char[s.length()];
		for(int i = 0; i < len; i++){
			c[i] = s.charAt(i);
		}
		for(int i = 0; i < len; i++){
			arr(c);
		}
		for(int i = 0; i < len - 1; i++){
			if(c[i] != c[i+1]){
				c[j++] = c[i];
			}
		}
		c[j++] = c[len - 1];
		int k;
		for(k = 0; k < j; k++){
			
		}
		
		if(k % 2 == 0)
		System.out.print("CHAT WITH HER!");
		else System.out.print("IGNORE HIM!");
	}
	
	public static void arr(char [] r){
		for(int i = 0; i < r.length - 1; i++){
			if(r[i] > r[i+1]){
				char temp = r[i];
				r[i] = r[i+1];
				r[i+1] = temp;
			}
		}
	}
}