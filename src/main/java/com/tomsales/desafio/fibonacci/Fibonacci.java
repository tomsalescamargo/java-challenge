package main.java.com.tomsales.desafio.fibonacci;

public class Fibonacci {
    // 0 1 1 2 3 5 8 13 ...

    public static long recursiveCalculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "O número de entrada deve ser maior ou igual a 0."
            );
        }

        if (n <= 1) {
            return n;
        }

        return recursiveCalculate(n - 1) + recursiveCalculate(n - 2);
    }

    public static long linearCalculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "O número de entrada deve ser maior ou igual a 0."
            );
        }

        if (n <= 1) {
            return n;
        }

        int count = 2;
        long prevFib = 0;
        long actualFib = 1;
        while (count <= n) {
            long bufferFib = prevFib + actualFib;
            prevFib = actualFib;
            actualFib = bufferFib;
            count++;
        }

        return actualFib;
    }
}