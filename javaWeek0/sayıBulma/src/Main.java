
public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayı bulundu.");
		}
		else {
			System.out.println("sayı bulunamadı.");
		}
	}

}
