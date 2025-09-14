package main.java.com.tomsales.desafio.primes;

import java.util.ArrayList;
import java.util.List;

public class Primes {

    public static List<Integer> linearPrimes(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException(
                    "O número de entrada deve ser maior que 1"
            );
        }

        List<Integer> primes = new ArrayList<>();
        for (int numberToCheck = 2; numberToCheck <= n; numberToCheck++) {
            boolean isPrime = true;

            // Only need to check up to sqrt
            // After the squrt results starts repeating
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(numberToCheck);
            }
        }
        return primes;
    }

    public static List<Integer> recursivePrimes(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException(
                    "O número de entrada deve ser maior que 1"
            );
        }

        if (n == 2) {
            List<Integer> basePrimes = new ArrayList<>();
            basePrimes.add(2);
            return basePrimes;
        }

        List<Integer> primesUpToNMinus1 = recursivePrimes(n - 1);

        // Verifies if the actual number(n) is prime
        boolean isNPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isNPrime = false;
                break;
            }
        }

        if (isNPrime) {
            primesUpToNMinus1.add(n);
        }

        return primesUpToNMinus1;
    }
}
