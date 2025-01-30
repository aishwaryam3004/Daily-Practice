/*You have two numbers, and your challenge is to write a program that performs both 
addition and subtraction with them. However, if any subtraction results in a negative 
number, display it as a positive value. How will you tackle this and show the final 
results?*/

class additionandsubtraction{
	public static void main(String[] args){
	int num1 = 56;
	int num2 = 60;
	int Addition = num1 + num2;
	int subtraction = Math.abs(num1 -  num2); //(Using Math.abs we can return the positive value) it is already positive value  it nothing changed
                  System.out.println("Addition of " + num1 + " and " + num2 + " : " + Addition);
	 System.out.println(" Subtraction of " + num1 + " and " + num2 + " : " + subtraction);
	}
}


/* other method
class AdditionAndSubtraction{
	public static void main(String[] args){
	int num1 = 56;
	int num2 = 60;
	int Addition = num1 + num2;
	int subtraction = num1 -  num2;
                 if(subtraction <0){ -> we can manually convert into positive
	      subtraction= - subtraction;  
	}
                          System.out.println("Addition of " + num1 + " and " + num2 +  : "+ Addition);
	         System.out.println("Subtraction of " + num1 + " and " + num2 + :" + subtraction);
     }
}
*/

		