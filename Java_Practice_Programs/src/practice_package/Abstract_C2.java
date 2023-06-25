package practice_package;

public class Abstract_C2 extends Abstract_C1{
	public void saving() 
		{                        // method signature
		System.out.println("saving regular");     // business logic
		}
	
		public void current() {
		System.out.println("current");
		
		}
		
		public void salary() {
		System.out.println("salary");
		}
		
		public void joint() {
		System.out.println("joint");
		}
		
		public static void main(String[] args) {
		Abstract_C2 info = new Abstract_C2();
		info.branchDetails();
		info.salary();
		info.saving();
		info.current();
		info.joint();
		}
}
