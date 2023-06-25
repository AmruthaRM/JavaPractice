package practice_package;
import java.util.*;
public class Datatypes {

	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string  
		System.out.println("You have entered: "+str);            
		System.out.println("Enter value of A and B ");  
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		

	}

}
