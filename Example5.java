package strings;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args) {
		String str, word;
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter humpty's Sentence: ");
	       str = scan.nextLine();
	       System.out.println("Dumpy says:"+str);
	       System.out.println("What humpty want to remove: ");
	       word = scan.nextLine();
	       str = str.replaceAll(word, "");
	       System.out.print("Dumpty's new setence:"+str);       
	}

}
