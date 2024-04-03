package mis768unlv;

public class StringMethods {
	public static void main(String[] args) {
		String message = "Java is great fun!";
				
		String lowercaseMessage=message.toLowerCase();
		String uppercaseMessage=message.toUpperCase();
		char letter = message.charAt(2);
		int stringSize = message.length();
		
		System.out.println(lowercaseMessage);
		System.out.println(uppercaseMessage);
		System.out.println(letter);
		System.out.print(stringSize);
		
	}

}
