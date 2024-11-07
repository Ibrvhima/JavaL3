package homeworkTrello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of photocopies: ");
        int copies = scanner.nextInt();
        double cost;

        if (copies <= 10) {
            cost = copies * 2;
        } else if (copies <= 30) {
            cost = 10 * 2 + (copies - 10) * 1.5;
        } else {
            cost = 10 * 2 + 20 * 1.5 + (copies - 30) * 1;
        }

        System.out.println("The total cost is: " + cost + " F");
    }
}

