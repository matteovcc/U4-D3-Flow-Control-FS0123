package app;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 2;
		String numeroInLettere;
		switch (numero) {
		  case 0:
		    numeroInLettere = "zero";
		    break;
		  case 1:
		    numeroInLettere = "uno";
		    break;
		  case 2:
		    numeroInLettere = "due";
		    break;
		  case 3:
		    numeroInLettere = "tre";
		    break;
		  default:
		    System.out.println("Non è compreso.");
		    return;
		}
		System.out.println(numeroInLettere);

	}

}
