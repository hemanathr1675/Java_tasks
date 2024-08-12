package task4;

public class MathOp {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum of "+a+" and "+b+" is: "+c);	
	}
	
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("The sum of "+a+" and "+b+" is: "+c);	
	}

	public static void main(String[] args) {
		MathOp obj=new MathOp();
		obj.add(10,20);
		obj.add(2.8,3.6);
		

	}

}
