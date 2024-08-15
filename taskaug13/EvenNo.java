package taskaug13;
import java.util.*;

public class EvenNo {
	
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range=sc.nextInt();
		String S=" ";
		int count=0;
		for(int i=1;i<=range;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nThe total count of even numbers within "+range+" is: "+count);
		
	}

	public static void main(String[] args) {
	  EvenNo obj=new EvenNo();
	  obj.display();

	}

}
