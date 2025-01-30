/*Imagine you need to repeat a cheerful message. Write a program that uses a for 
loop to print "ALL IS WELL" exactly twenty times. How will you set up your loop to 
ensure this message appears the right number of times?
*/

class useforloop{
	public static void main(String[] args){
		for(int i=1;i<=20;i++){ // intalize i value as 1 and give condition as greater than equal to 20 and increment at each step,so it will iterator exactly 20 times
			System.out.println("ALL IS WELL");
		}
	}
}
