//JavaRecursion is how you can call a method inside a method 
package JavaRecursion;


public class main {

	public static void main(String[] args) {
	//calling say Hi so it print Hi 15 times	
		sayhi(15);
		
	}
	//creating say hi method with parameter called i 
	public static void sayhi(int i) {
	//when 'i' reach 0 I want you to print done
	if (i == 0 ) {
		System.out.println("done");
		//otherwise print Hi and then decrease i with 1 and call the method again
	}else {
		System.out.println("Hi" + i);
		i--;
		sayhi(i);
	}
	
}
}
