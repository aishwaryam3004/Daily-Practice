/*Write a Program to check the given number is divisible by both 3&4 if it is so print "Good Morning". 
If a number is divisible by only 4 but not 3 then print "Good Afternoon", 
If it is divisible by only 3 but not 4 then print "Good Evening" otherwise print "Good Night".? 
*/
import java.util.Scanner;
class Divisiblsecheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the number:");
		int num = sc.nextInt();
		if (num%3==0)&&(num%4==0){ // check if number divisible by both 3 and 4 
			System.out.println("Good Morning");
		} else if (num%4==0){ // check if number divisible only by 4
			System.out.println("Good Afternoon");
		} else if(num%3==0){// check if number divisible only by 3
			System.out.println("Good Evening");
		} else{ // if all condition is false it will print else part
			System.out.println("Good Night");
		}
	}
}
			
