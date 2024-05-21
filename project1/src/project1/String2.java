package project1;

public class String2 {

	public static void main(String[] args) {
	
		
		String city1="mumbai",city2="chennai";
		
		System.out.println("Before Swapping....");
		System.out.println("City1...."+city1);
		System.out.println("City2...."+city2);
		
		String data = city1+city2;// HYDDelhi
		city2 = data.substring(0, city1.length());//HYDDelhi
		
		city1=data.substring(city1.length());//
		
		System.out.println("After Swapping....");
		System.out.println("City1...."+city1);
		System.out.println("City2...."+city2);
		
		
		
		
		
		
	}

}
