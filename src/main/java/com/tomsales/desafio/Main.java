package main.java.com.tomsales.desafio;

import main.java.com.tomsales.desafio.fibonacci.Fibonacci;
import main.java.com.tomsales.desafio.primes.Primes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            int fibPosition = 4;
            System.out.println("---- Fibonacci ----");
            System.out.println("Fibonacci até a posição " + fibPosition);
            System.out.println("Resultado Linear: " + Fibonacci.linearCalculate(fibPosition));
            System.out.println("Resultado Recursivo: " + Fibonacci.recursiveCalculate(fibPosition));


            int nPrimes = 25;
            System.out.println("\n---- Primos ----");
            System.out.println("Encontrando primos até " + nPrimes);

            List<Integer> linearPrimes = Primes.linearPrimes(nPrimes);
            System.out.println("Linear: " + linearPrimes);

            List<Integer> recursivePrimes = Primes.recursivePrimes(nPrimes);
            System.out.println("Recursivo: " + recursivePrimes);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
