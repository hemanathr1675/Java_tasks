package javaprogramtasks;

import java.util.*;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
        int num=sc.nextInt();
        System.out.println("Reversed number:");
        
        
        while(num!=0) {
        	int digit=num%10;
        	 
        	System.out.print(digit);

        	num=num/10;
        }


	}

}
