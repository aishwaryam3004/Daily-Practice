/*You have a number to examine, and your mission is to write a program that checks 
whether this number can be divided evenly by 27. Can you find out if it‟s a multiple of 
27?*/
class multiple{
	public static void divisible(int n){
		if(n%27==0){
			System.out.println("The given number is divisible b 27");
		}else{
		       System.out.println("The given number is not divisible b 27");
		}
	}
public static void main(String[] args){
	divisible(54);
	}
}
