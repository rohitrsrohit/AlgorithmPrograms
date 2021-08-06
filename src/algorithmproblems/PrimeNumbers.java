package algorithmproblems;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i = 0;
		int temp = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int a = 0;
			for (temp = i; temp >= 1; temp--) {
				if (i % temp == 0) {
					a = a + 1;
				}
			}
			if (a == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :" +primeNumbers);
		
	}
}
