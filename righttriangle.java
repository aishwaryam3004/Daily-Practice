import java.util.Scanner;
public class righttriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();  // Read the number of rows

        // Outer loop to iterate through each row
        for (int i = 1; i <= N; i++) { //
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  // Print star on the same line
            }
            System.out.println();  // Move to the next line after printing all stars in this row
        }
        scanner.close();  // Close the scanner
    }
}
