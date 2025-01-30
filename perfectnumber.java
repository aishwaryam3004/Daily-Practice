public class perfectnumber {
    public static void main(String[] args) {
        int sum = 0;
        int num = 28;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {  
                sum += i;  
            }
        }
        if (sum == num) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
