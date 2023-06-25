package practice_package;

public class ForrLoop {

	public static void main(String[] args) {
		
			System.out.println("Start");
			for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			}
			System.out.println("End");
	
	//Inner For Loop
	System.out.println("Inner For loop");
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 6; j++) {
		System.out.print(i);
		}
		System.out.println();
		}
	
	//Inner For with break
	System.out.println("Inner For loop with break");
	for (int i = 1; i <= 10; i++) {
		
		if (i == 5) {
		break;
		}
		System.out.println(i);
		}
		}
	}

	


