package Task3;

public class circle {
	private float radius;
	private String color;

public circle(float radius,String color)
{
	this.radius=radius;
	this.color=color;
}
public void display() {
	System.out.println("The radius of the circle is "+this.radius);
	System.out.println("The color of the circle is "+this.color);
	
}

	public static void main(String[] args) {
		circle c=new circle(1,"Red");
		c.display();
	}

}
