import java.util.Scanner; 
public class Evennumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt(); 
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
   