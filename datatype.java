public class datatype{
	public static void main(String[] args){
	System.out.println("Bytes");
   	System.out.println(Byte.SIZE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);

	System.out.println("INTEGER");
	System.out.println(Integer.SIZE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);

	System.out.println("CHARACTER");
	System.out.println(Character.SIZE);
	System.out.println((int)Character.MIN_VALUE);   // character dose not have minvalue and max value we can convert into int to see the range it is called explicit casting
	System.out.println((int)Character.MAX_VALUE);

	System.out.println("DOUBLE");
   	System.out.println(Double.SIZE);
	System.out.println(Double.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);

	System.out.println("LONG");
	System.out.println(Long.MIN_VALUE);
	System.out.println(Long.MAX_VALUE);
	}
}	