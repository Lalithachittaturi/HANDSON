package strings;
import java.util.Scanner;
public class Example4 {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter humpty's Sentence:");
		String str1 = sc.nextLine();
		System.out.println("word to replace:");
		String search = sc.nextLine();
		System.out.println("Synonym");
		String replace = sc.nextLine();
		String result = str1.replace(str1, replace);
		System.out.println("Result = " + result);
	}
	


}
