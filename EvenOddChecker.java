import java.util.Scanner;

public class EvenOddChecker {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        if (isEven(input)) {
            System.out.println(input + " is even.");
        } else {
            System.out.println(input + " is odd.");
        }

        scanner.close();
    }
}