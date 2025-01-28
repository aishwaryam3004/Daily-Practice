public class leapyear {
	public static void year(int yr){
		if((yr%4==0)&&(yr%100!=0)||(yr%400==0))  // if yr is divisible by 4 and yr is  divisible 100 or 400 The year is leap year 
			System.out.println(yr+ " " +"is a leap year");
		else
			System.out.print(yr+ " " +"is not a leap year");
	}
//Example Test case
	public static void main(String[] args){
		year(2000);
		year(1993);
	}
}