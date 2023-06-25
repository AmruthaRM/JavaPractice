package practice_package;

public class Encapsulation1 {
	private int a = 10;
	int b = 20;
	String bname = "Amrutha";

	public void walk()
	{
		System.out.println("Walk");
		
		
	}
	public void run() {
		System.out.println("run");
		
	}
	public static void main(String[] args) {
		Encapsulation1 d = new Encapsulation1();
		System.out.println(d.a);
	}
		
	
		
		
}

