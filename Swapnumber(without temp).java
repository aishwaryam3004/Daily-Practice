class Swapnumber(without temp){
           public static void main(String[] args) {
                  int num1 = 46;
                  int num2 = 97;
           System.out.println("Before swap: num1:" + num1+"num2 :"+num2);
           num1 = num1 + num2; // Add first two numbers   (the addition value is updated into the num1)
           num2 = num1 - num2 ; // with updated value of num 1 the num 1 and num 2 is subract and it was added into the num 2
           num1 = num1 - num2; // Again num 1 value updated with updated num 1 and num 2 
         System.out.print("After Swap:");
         System.out.println("num1:"+ num1+"num2 :" +num2);
      }
}