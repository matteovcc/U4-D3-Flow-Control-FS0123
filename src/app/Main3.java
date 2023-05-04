package app;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 2;
		String numeroInChars;
		switch (numero) {
		  case 0:
		    numeroInChars = "zero";
		    break;
		  case 1:
		    numeroInChars = "uno";
		    break;
		  case 2:
		    numeroInChars = "due";
		    break;
		  case 3:
		    numeroInChars = "tre";
		    break;
		  default:
		    System.out.println("Non è compreso.");
		    return;
		}
		System.out.println(numeroInChars);

	}

}
