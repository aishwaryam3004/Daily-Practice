public class reverse{
	public static void reverse(String s1){
		String reversed="";
		for(int i=s1.length()-1;i>=0;i--){
			reversed +=s1.charAt(i); // Add the reversed charcter to a reversed variable string
		}
		System.out.println("Reversed String:"+reversed);
	}
	public static void main(String[] args){
		reverse("Super76");
         }
}