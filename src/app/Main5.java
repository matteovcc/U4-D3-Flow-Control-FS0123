package app;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci numero");
		int numero = in.nextInt();
		
		for (int i = numero; i >= 0 ; i--) {
			System.out.println(i);
		}
		
		in.close();
	}

}
