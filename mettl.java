 //METTL
Question 1 
How to Attempt? 
Return last digit of the given number. 
Write a function that returns the last digit of the given number. Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number. 
The last digit should be returned as a positive number. 
for example, 
if the given number is 197, the last digit is 7 
if the given number is -197, the last digit is 7 

import java.io.*; 
import java.util."; 
// Read only region start 
class UserMainCode 
{ 
	public int lastDigitOf(int input1){ 
	// Read only region end 
	// Write code here... 
	int temp = input1 % 10; 
	return Math.abs(temp); 
	} 
}
