package app;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringaPariDispari());
		System.out.println(annoBisestile());
	}
	
	
	
	
	public static boolean stringaPariDispari() {
		String stringa = "ciao";
		if(stringa.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean annoBisestile() {
		int numero =2015;
		if(numero % 4 == 0 || numero % 400 == 0 && numero % 100 == 0 ) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
