package practice;
import java.util.Scanner; 
public class CamelCase1 {
	public static String convertToCamelCase(String sentence) {
		String words[] = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			char firstChar = word.charAt(0);
			if (!Character.isUpperCase(firstChar)) {
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
		}
		String result = sb.toString().trim();
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the event name:");
		String userInput = sc.nextLine();
		sc.close();
		System.out.println("Event name in camel case :" + convertToCamelCase(userInput));
	}
}
