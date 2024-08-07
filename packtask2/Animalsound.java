package packtask2;

abstract class Animal //abstract class 
{
	abstract void sound(); //abstract method
}

class Lion extends Animal //inherits abstract class
{
	void sound() //method overriding
	{
		System.out.println("Lion Roars");
	}
}
  
class Tiger extends Animal //inherits abstract class
{
	void sound() //method overriding
	{
		System.out.println("Tiger groans");
	}
}

public class Animalsound {

	public static void main(String[] args)
	{
		Animal obj1=new Tiger(); 
		obj1.sound(); //calls the sound() method of class Tiger
		Animal obj2=new Lion();
		obj2.sound(); //calls the sound() method of class Lion
		
	}

}
