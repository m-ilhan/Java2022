
public class Main {

	public static void main(String[] args) {
		sayıBulmaca();

	}

	public static void sayıBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 578;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMı = true;
				break;
			}
		}
		if (varMı == true) {
			mesajVer("sayı mevcuttur:" + aranacak);
		} else {
			mesajVer("sayı mevcut değildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
