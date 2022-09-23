package testequals;

public class TesEquals {
	
	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = "hello";
		//refers memory location
		if(string1==string2)
			System.out.println("String are equal");
		else
			System.out.println("String are not equal");
		
		String anotherstring1 = new String("hello");
		String anotherstring2 = new String("hello");
		//it has different memory location
		if(anotherstring1.equals(anotherstring2))
			System.out.println("Another String are equal");
		else
			System.out.println("Another String are not equal");
	}

}
