public class pratice8 {
    public static void main(String[] args) {
        int num1 = 26;
        int num2 = 30;
        System.out.println("num 1: " + num1);
        System.out.println("num 2: " + num2);
        // Swapping using a temporary variable
        int temp = num1; // Using a temporary variable temp to temporarily store the value of one number
        num1 = num2;  // Assign num 2 to num1
        num2 = temp; // Assign temp original num1  to num2
        System.out.println("After swapping:");
        System.out.println("num 1: " + num1);
        System.out.println("num 2: " + num2);
    }
}
