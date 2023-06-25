package practice_package;

public class Encapsulation2 {

	public static void main(String[] args) {
		Encapsulation1 encap = new Encapsulation1();
		encap.walk();
		encap.run();
		//System.out.println(encap.a); since a is mentioned  as private
		System.out.println(encap.b);
		
		

	}

}
