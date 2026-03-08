
public class Main {

	public static void countPrimeNumber(int number) {
		int count = 0;
		if (number < 1) {
			System.out.println(number + " Is Not A Prime Number");
			return;
		}
		for (int i = 2; i < number; i++) {
			boolean check = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				count++;
			}
		}
		System.out.println("\nTotal Prime Number: " + count);

	}

	public static void main(String[] args) {
		countPrimeNumber(10);
	}

}
