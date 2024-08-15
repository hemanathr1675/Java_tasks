package taskaug14;

public class WrapperClass {
	
	//autoboxing

	public static void main(String[] args) {
		//converting int into Integer class
		int primitiveInt=10;
	    Integer WrapperInt=primitiveInt; //implicitly compiler converts int into Integer class
	    
	    System.out.println("Wrapper Int: "+WrapperInt);
	    
	    //converting boolean into Boolean class
	    boolean primitiveBoolean=true;
	    Boolean WrapperBoolean=primitiveBoolean; //implicitly compiler converts boolean into Boolean class
	    System.out.println("Wrapper boolean: "+WrapperBoolean);

	}

}
