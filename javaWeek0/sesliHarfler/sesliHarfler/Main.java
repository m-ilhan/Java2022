package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'Z';

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harf.");
			break;
		
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("ince sesli harf.");
			break;

		
		default:
			System.out.println("Sessiz harf.");
		}

	}

}
