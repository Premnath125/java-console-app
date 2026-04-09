package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Multiplication");
            System.out.println("4. Factorial");
            System.out.println("5. Prime Number Check");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println("Result: " + (x * y));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    System.out.println("Factorial: " + fact);
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    int p = scanner.nextInt();
                    boolean isPrime = true;
                    if (p <= 1) isPrime = false;
                    for (int i = 2; i <= Math.sqrt(p); i++) {
                        if (p % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(p + " is " + (isPrime ? "Prime" : "Not Prime"));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}