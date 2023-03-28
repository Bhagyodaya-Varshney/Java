import java.lang.String;
public class String_Methods{
	public static void main(String [] args){
		String name = new String("maYank saxEna");
		String name2 = "Mayank Saxena";
		String name3 = "May ank Saxena";
		String name4 = "";
		String name5 = " ";
		String name6 = "Hello";

		int diff = name2.compareTo(name);
		System.out.println(diff);

		int diff2= name2.compareTo(name3);
		System.out.println(diff2);

		int diff3 = name.compareToIgnoreCase(name2);
		System.out.println(diff3);

		System.out.println(name4.isBlank());

		System.out.println(name5.isBlank());

		System.out.println(name6.isBlank());

		System.out.println(name2.endsWith("ena"));

		System.out.println(name2.endsWith("eNa"));

		System.out.println(name2.endsWith(""));

		System.out.println(name2.endsWith(" "));
		
		int diff4=name2.length();
		System.out.println(diff4);
		}
}