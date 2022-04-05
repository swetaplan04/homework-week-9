package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char ch;

        do {

            System.out.println("Enter first Number: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Enter second Number: ");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/: ");
            char symbol = scanner.next().charAt(0);
            Calculator calc = new Calculator();
            calc.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more caculation please enter  Y or N: ");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
