package practice_package;

public class Inheritance_Child1 extends InheritanceParent{
	int child1 = 35;
	public static void main(String[] args) {
		
		
		//Single level inheritance
		int child2 = 30;
		Inheritance_Child1 a = new Inheritance_Child1();
		
		System.out.println(a.parent);
		System.out.println(child2);
		System.out.println(a.child1);
		

	}

}
