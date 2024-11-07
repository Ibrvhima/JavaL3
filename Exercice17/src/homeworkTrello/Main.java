package homeworkTrello;

import java.util.Scanner;

public class Main {

    // a. Sum of the first N natural numbers
    public static void sumOfN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }

    // b. Find minimum and maximum in a set of N numbers
    public static void minMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }

    // c. Division without using / operator
    public static void divisionWithoutOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend A: ");
        int A = scanner.nextInt();
        System.out.print("Enter divisor B: ");
        int B = scanner.nextInt();

        int quotient = 0;
        int remainder = A;

        while (remainder >= B) {
            remainder -= B;
            quotient++;
        }

        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
    }

    // d. Product of two integers using only addition
    public static void productUsingAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int product = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            product += Math.abs(a);
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            product = -product;
        }

        System.out.println("Product: " + product);
    }

    // e. Check if A is divisible by B
    public static void checkDivisibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer A: ");
        int A = scanner.nextInt();
        System.out.print("Enter integer B: ");
        int B = scanner.nextInt();

        if (A % B == 0) {
            System.out.println(A + " is divisible by " + B);
        } else {
            System.out.println(A + " is not divisible by " + B);
        }
    }

    // f. Find all divisors of an integer
    public static void findDivisors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer X: ");
        int X = scanner.nextInt();

        System.out.print("Divisors of " + X + " are: ");
        for (int i = 1; i <= X; i++) {
            if (X % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // g. Check if a number is prime
    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer X: ");
        int X = scanner.nextInt();

        boolean isPrime = true;
        if (X <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(X); i++) {
            if (X % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(X + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    // h. Sum of digits of an integer
    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int N = scanner.nextInt();

        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an exercise (1-8): ");
        System.out.println("1. Sum of the first N natural numbers");
        System.out.println("2. Find minimum and maximum in a set of N numbers");
        System.out.println("3. Division without using / operator");
        System.out.println("4. Product of two integers using only addition");
        System.out.println("5. Check if A is divisible by B");
        System.out.println("6. Find all divisors of an integer");
        System.out.println("7. Check if a number is prime");
        System.out.println("8. Sum of digits of an integer");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 : sumOfN();
            case 2 : minMax();
            case 3 : divisionWithoutOperator();
            case 4 : productUsingAddition();
            case 5 : checkDivisibility();
            case 6 : findDivisors();
            case 7 : checkPrime();
            case 8 : sumOfDigits();
            default : System.out.println("Invalid choice.");
        }
    }
}

