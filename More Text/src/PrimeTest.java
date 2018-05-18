import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primes");

		int size = Integer.MAX_VALUE/10;
		boolean[] primes = new boolean[size];

		// Set all numbers as prime
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}

		// Multiples of primes are not prime
		for (int i = 2; i * i < primes.length; i++) {
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}

		Scanner reader = new Scanner(System.in);
		boolean run = true;
		while (run) {
			// Input the number
			System.out.print("Check to see if prime (type \"no\" to exit): ");
			String check = reader.next();
			
			if(check.toLowerCase().equals("no"))
				run = false;
			else {
				int number = Integer.parseInt(check);
				// Output the result
				if (number < 0)
					System.out.println("false");
				else
					System.out.println(primes[number]);
			}
		}
		System.out.println("\n\nComplete.");
		reader.close();
	}
}
