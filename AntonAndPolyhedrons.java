import java.util.Scanner;
 
	public class AntonAndPolyhedrons {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String s1 = "Tetrahedron";
			String s2 = "Cube";
			String s3 = "Octahedron";
			String s4 = "Dodecahedron";
			String s5 = "Icosahedron";
			int result = 0;
			for(int i = 0; i < n; i++) {
				String s = in.next();
				if(s.equals(s1)) result += 4;
				else if(s.equals(s2)) result += 6;
				else if(s.equals(s3)) result += 8;
				else if(s.equals(s4)) result += 12;
				else if(s.equals(s5)) result += 20;
			}
			System.out.println(result);
		}
	}