package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int voto = 94;

		if (voto >= 90) {
		    System.out.println("Hai preso un'ottima votazione!");
		} else if (voto >= 80) {
		    System.out.println("Hai preso una buona votazione.");
		} else if (voto >= 60) {
		    System.out.println("Hai preso una sufficienza.");
		} else {
		    System.out.println("Hai sbagliato l'esame.");
		}
		
		int giorno = 3;
		
		switch(giorno) {
		case 1:
		System.out.println("Lunedi");
		break;
		case 2:
			System.out.println("martedi");
			break;
		case 3:
			System.out.println("Mercoledi");
			break;
		case 4:
			System.out.println("Giovedi");
			break;
		case 5:
			System.out.println("Venerdi");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
		
		}
		
//		int p = 1;
//		while(p <= 12) {
//			System.out.println(p);
//			p++;
//		}
		
		
		for (int i =0;i <= 10;i++) {
			System.out.println(i);
		}
		
		 int xx = 6;
		do {
			System.out.println(xx++);
		} while (xx < 10);
		
		
		int grandezza = 10;
		for(int i = 1;i <= grandezza;i++) {
			for(int j = 1; j <= grandezza;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
