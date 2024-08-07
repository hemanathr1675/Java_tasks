package packtask1;

import java.util.Scanner;

public class MathSum {
    static int a,b;
    

    public void add() {
        int c = a + b;
        System.out.println("The addition of "+a+" and "+b+" is: "+c);
    }

    public void sub() {
        int d = a - b;
        System.out.println("The subraction of "+a+" and "+b+" is: "+d);
    }

    public void multiply() {
        int e = a * b;
        System.out.println("The multiplication of "+a+" and "+b+" is: "+e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        MathSum obj=new MathSum();
        
        obj.add();
        obj.sub();
        obj.multiply();
    }
}
