package variabletask;

public class InstanceVar {
	
	String name; //instance variables which is declared inside the class
	int roll_no;
public InstanceVar(String name,int roll_no) {
	this.name=name;
	this.roll_no=roll_no;
}
void display() {
	System.out.println("Name: "+name);
	System.out.println("Roll_No : "+roll_no);
}

	public static void main(String[] args) {
		InstanceVar obj=new InstanceVar("Hemanath",20);
		obj.display();
		

	}

}
