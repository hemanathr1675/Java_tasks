package taskaug14;

public class UnBoxing {

	public static void main(String[] args) {
		// unboxing that converts class into their respective primitive data types
		Integer WrapperInt=10;
		int PrimitiveInt=WrapperInt; //implicitly converts the Integer class into primitive int
		System.out.println("Primitive Int: "+PrimitiveInt);
		
		Boolean WrapperBoolean=true;
		boolean PrimitiveBoolean=WrapperBoolean; //implicitly converts the Boolean class into primitive boolean
		System.out.println("Primitive Boolean: "+PrimitiveBoolean);

	}

}
