package example3;

public class RestrictedStackExample {

	public static void main(String[] args) {

		// Integer-pino
		RestrictedStack<Integer> intStack = new RestrictedStack<>(10);
		Integer intObj = Integer.valueOf(15);
		intStack.add(intObj);
		intStack.add(20);
		intStack.add(8);
		intStack.add(12);
		
		
		while(!intStack.isEmpty())
		{
			intObj = intStack.peek();
			System.out.printf("Otettiin luku %d%n", intObj);
		}
		
		// String-pino
		RestrictedStack<String> strStack = new RestrictedStack<>(10);
		strStack.add("kissa");
		strStack.add("koira");
		
		while(!strStack.isEmpty())
		{
			String str = strStack.peek();
			System.out.printf("Otettiin merkkijono %s%n", str);
		}
	}

}
