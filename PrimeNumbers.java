public class PrimeNumbers {

	public static void checkPrime(int n) {

		boolean isPrime = true;
		
		if (n == 1) {
			System.out.println("It is an universal number.");
			return;
		}

		for (int i = 2; i <= n / 2; ++i) {

			if (n % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) 
			System.out.println("Prime number.");
		else 
			System.out.println("Not a prime number.");
	}

	public static void main(String[] args) {

		checkPrime(4);
		checkPrime(9);
		checkPrime(7);
	}
}