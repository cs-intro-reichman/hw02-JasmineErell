import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		int len = str.length();
		char middle = ' ';
		String rev = "";
		int i = 0;
		if (len%2==0) {
			middle = str.charAt(len/2); 
		}
		else{
			middle = str.charAt((len/2)); 
		 }
		while (i<len) {
			rev += str.charAt(len -1 ); 
			len--;
		}
		System.out.println(rev);
		System.out.println("The middle character is " + middle);
	}
}
