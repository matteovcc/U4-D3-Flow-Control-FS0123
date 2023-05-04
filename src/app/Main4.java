package app;

import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la tua stringa");
		String stringa = in.nextLine();

//		
//		if (stringa.contains(":q")) {
//			System.out.println("NON PUOI");
//		}
		
		while(!stringa.equals(":q")) {			
			String[] arrayChar = stringa.split("");
//			System.out.println(Arrays.toString(arrayChar));
			System.out.println(String.join(",", arrayChar));
			break;
			
		}
		in.close();
		
		
		
	}

}
