/*1.Imagine you‟re on a quest to discover never-ending loops. Create a program that 
demonstrates two types of endless journeys: one using a for loop and another using a 
while loop. How will you set up these loops to keep running forever, showcasing their 
infinite nature?
*/

class forinfiniteloop{
	public static void main(String[] args){
		for(int i =1;i<=10;i--){              // This for loop never becomes reach the positive value of 10 . it decrements (-) infinte times
			System.out.println(i);
		}
	}
}

/* infinite for loop
for(;;){ -> In java without giving any initalization,condition,increment/decrement still runs. it is valid in java 
        System.out.println("infinte loop"); 
	}

infinite loop using true condition
for(int i = 0;true;i++){ -> in for loop we can give true. java taken it as true to iterate it never change false.
	System.out.println("Infinte loop");
	}
*/


