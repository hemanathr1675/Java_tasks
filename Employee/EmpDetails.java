package packtask1;
import java.util.*;

public class EmpDetails {
	
	    public void display() {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the employee id: ");
	    	String emp_id=sc.nextLine();
	    	System.out.println("Enter the employee name: ");
	    	String emp_name=sc.nextLine();
//		String emp_id="123";
//		String emp_name="Hemanath";
		System.out.println("Employee id:"+emp_id);
		System.out.println("Employee name:"+emp_name);
	}

}
