package Task3;

public class student {
	private String name;
	private int roll_no;
	private double marks;
	
public student(String name,int roll_no,double marks) {
	this.name=name;
	this.roll_no=roll_no;
	this.marks=marks;
}
public void display() {
	System.out.println("Name:"+this.name);
	System.out.println("Role.No:"+this.roll_no);
	System.out.println("Marks:"+this.marks);
}

	public static void main(String[] args) {
		student S=new student("Hemanath",20,98.5);
		S.display();
		

	}

}
