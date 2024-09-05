import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        // Correct Scanner instantiation by passing System.in
        Scanner scan = new Scanner(System.in);

        // Read two integers from the input
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        // Print the sum of the two numbers
        System.out.println("The sum is: " + (num1 + num2));

        // Close the scanner
        scan.close();
    }
}
