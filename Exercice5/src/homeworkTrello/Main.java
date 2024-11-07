package homeworkTrello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 3: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 3);

        System.out.println("You entered a valid number: " + number);
    }
}

