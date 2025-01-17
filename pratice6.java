public class pratice6 {
    public static void main(String[] args) {
        String input = "VEL TECH HIGH TECH";
        int vowelcount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelcount++;
            }
        }
        System.out.println("Number of vowels in '" + input + "' is: " + vowelcount);
    }
}
