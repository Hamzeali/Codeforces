import java.util.Scanner;
 
	public class AntonAndDanik {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String s = in.next();
			int cntA = 0;
			int cntD = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'A')
					cntA++;
				else cntD++;
			}
			if(cntA > cntD)
				System.out.println("Anton");
			else if(cntD > cntA)
				System.out.println("Danik");
			else
				System.out.println("Friendship");
		}
	}
	