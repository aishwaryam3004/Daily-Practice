class Vowels {
    public static void vowelsto(char s1) {
        if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u' ||  s1 == 'A' || s1 == 'E' || s1 == 'I' || s1 == 'O' || s1 == 'U') // Using Logical operator "OR" checks the condition
		{
            System.out.println("Vowel: " + s1);
        } else {
            System.out.println("The given character is not a vowel");
        }
    }

    public static void main(String[] args) {
        vowelsto('E'); 
    }
}
