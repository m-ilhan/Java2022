public class Main {

	public static void main(String[] args) {
		int number = 496;
		int i = 1;
		int total = 0;
		while (i < number) {

			if (number % i == 0) {
				total += i;
			}
			i++;
		}
		if (total == number) {
			System.out.println(number + "mükemmel sayıdır.");
		} else {
			System.out.println(number + "mükemmel sayı değildir.");
		}

	}

}
