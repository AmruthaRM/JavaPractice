package practice_package;

public class Interface2 implements Interface1
{

		
		public void saving() {
			System.out.println("saving regular");
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
			public void branchDetails() {
			System.out.println("chennai");
			}
			public static void main(String[] args) {
			Interface2 info = new Interface2();
			info.branchDetails();
			info.salary();
			info.saving();
			info.current();
			info.joint();

	}

}
