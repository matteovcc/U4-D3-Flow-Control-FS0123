package app;
import java.util.Arrays;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la tua stringa");
		String stringa = in.nextLine();
//		stringa.split(",");
		
//		System.out.println(stringa.split(","));
		
		
		
//		while(stringa != "q") {
//			System.out.println(stringa.split(","));
//			break;
//		}
		
//		if (stringa == ":q") {
//			System.out.println("NON PUOI");
//		}
//		
//		while(stringa != ":q") {			
//			String[] arrayChar = stringa.split("");
//			System.out.println(Arrays.toString(arrayChar));
//			break;
//			
//		}
		
		if (stringa.contains(":q")) {
			System.out.println("NON PUOI");
		}
		
		while(!stringa.contains(":q")) {			
			String[] arrayChar = stringa.split("");
			System.out.println(Arrays.toString(arrayChar));
			break;
			
		}
		in.close();
		
		
		
	}

}
