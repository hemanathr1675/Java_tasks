package packtask1;
import java.util.*;

public class AddNum {
	
	static void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The sum of two numbers is:"+c);
		
	}

	public static void main(String[] args) {
		sum();
		}
  
}
