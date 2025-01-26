import java.util.Scanner;
public class rectangle{
  	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height:");
		float h = sc.nextFloat(); 
		System.out.print("Enter the width:");
		float w = sc.nextFloat();
		float area = h*w;  // using * operator multiply the two input to find the area of the rectangle
		System.out.println("Area=" + area);
	}
} 
		
