import java.util.Scanner;
 
 
public class ThePleasantWalk {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int ans = 1;
		for(int i =1;i<n;i++)
		{
			if(a[i]!=a[i-1])
			{
				ans++;
				max = Math.max(max, ans);
			}
			else
			{
				ans = 1;
			}
		}
		max = Math.max(ans, max);
		System.out.println(max);
		sc.close();			
		
	}
}