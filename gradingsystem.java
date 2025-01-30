import java.util.Scanner;
public class gradingsystem{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Mark:");
	int Mark = sc.nextInt();
	if( Mark>=90){ // To check the grade based on mark 
	          System.out.println('A');
	} else if(Mark>=80){ // if the first condition is false it check another condition
	         System.out.println('B');
	} else if(Mark>=70){
	        System.out.println('C');
	} else if(Mark>=60){
	        System.out.println('D');
	} else {
	        System.out.println('F');
		}
	}
}
		