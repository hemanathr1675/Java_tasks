package taskaug13;
import java.util.*;

public class SwitchCase {
	
	public void mathop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1: ");
		double num1=sc.nextDouble();
		System.out.println("Enter the num2: ");
		double num2=sc.nextDouble();
		System.out.println("Enter the operation(1-add,2-sub,3-multi,4-div)");
		int operation=sc.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println("The sum of num1 & num2 is: "+(num1+num2));
			break;
			
		case 2:
			System.out.println("The difference of num1 & num2 is: "+(num1-num2));
			break;
			
		case 3:
			System.out.println("The multiply of num1 & num2 is: "+(num1*num2));
			break;
			
		case 4:
			if(num1==0) {
				System.out.println("Invalid operation");
				
			}
			else {
				System.out.println("The division of num1 & num2 is: "+(num1/num2));
			}
			break;
		
		}
		
	}

	public static void main(String[] args)
	{
		SwitchCase obj=new SwitchCase();
		obj.mathop();
	}

}
