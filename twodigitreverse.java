class twodigitreverse {
    public static void main(String[] args) {
        int n = 65;
        int digit = n % 10; //Extract or getting last digit
        int n1 = digit;     //store extract digit 
        n = n / 10;   //remove last digit       
        int n2 = n;  //store last digt
        System.out.print(n1+""+n2);
    }
}