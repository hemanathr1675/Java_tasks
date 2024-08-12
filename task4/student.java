package task4;

public class student {
	
	public student(String name,int age) //constructor with two parameters
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
    public student(String gender,int roll_no,double marks) //constructor overloading with three parameters
    {
    	System.out.println("Name:"+gender);
    	System.out.println("Register number:"+roll_no);
    	System.out.println("Marks:"+marks);
	}
    public student(String address) //constructor overloading with single parameter
    {
    	System.out.println("Address:"+address);
	} 
	

	public static void main(String[] args) {
		//calling all the constructor method by creating different objects by passing the respective parameters
		student S1=new student("Hemanath",21);
		student S2=new student("Male",20,98.5);
        student S3=new student("Thiruvallur");
	}

}
