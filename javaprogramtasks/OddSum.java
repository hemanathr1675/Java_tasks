package javaprogramtasks;
import java.util.*;

public class OddSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range limit");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i/2*2!=i) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nThe sum of the above odd numbers is: "+sum);

	}

}
