package practice_package;

public class Method_Override2 extends Method_OverRiding1 {

	public void method1()
	{
		System.out.println("you eat");
	} 
	
	public static void main(String[] args) {
		Method_OverRiding1 m1 = new Method_OverRiding1();
		m1.method1();
		Method_Override2 m2 = new Method_Override2();
		m2.method1();
	}

}
