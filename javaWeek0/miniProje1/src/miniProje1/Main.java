package miniProje1;

public class Main {

	public static void main(String[] args) {
		int number = -9;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime) {
			System.out.println(number + " sayısı asaldır.");
		}

		else {
			System.out.println(number + " sayısı asal değildir.");
		}
	}

}
