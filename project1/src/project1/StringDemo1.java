package project1;

public class StringDemo1 {

	public static void main(String[] args) {
	
		
		int a =100,b=200;
		System.out.println("Before Swapping...");
		System.out.println("a--->"+a);
		System.out.println("b...."+b);
		a = a+b;
		b = a-b;// a+b-b
		a=a-b;// a+b-a
		
		System.out.println("After Swapping...");
		System.out.println("a--->"+a);
		System.out.println("b...."+b);
		
	}

}
