package variabletask;
import java.util.*;

public class FinalVar {
	final double pi=3.14;
	
void circle()
{
	
	System.out.println("Radius of the circle: ");
	Scanner sc=new Scanner(System.in);
	double radius=sc.nextDouble();
	double area=pi*radius*radius;
	System.out.println("The area of the circle is: "+area);
	
}
	



	public static void main(String[] args) {
		FinalVar obj=new FinalVar();
		obj.circle();
		
		

	}

}
