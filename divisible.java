import java.util.Scanner;
class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 3; i<=n; i++){
            if (i % 3==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The numbers which is divisible 3 are " + count);
        
    }
   
}