import java.util.Scanner;

/**
 * @author Andrew Herbert
 * @version May 13, 2019
 */
public class ShiftDecryptor {

	static String[] alphabet;
	
	/**
	 * Simply runs 26 iterations of the shift cipher in reverse. 
	 */
	public static void main(String[] args) {
		alphabet = new String[]{"a","b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		System.out.println("Please enter the text to decrypt without spaces. \n");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		decrypt(text);
		scanner.close();
	}
	
	/**
	 * Prints all possibilites of the shift cipher on seperate lines.
	 * @param s The string to decrypt.
	 */
	public static void decrypt(String s) {
		s.toLowerCase();
		String[] sarray = s.split("");
		for(int b = 1; b < 26; b++) {
			String result = "";
			for(int i = 0; i < sarray.length; i++) {
				for(int k = 0; k < alphabet.length; k++) {
					if(sarray[i].equals(alphabet[k])) {
						int sum = k - b;
						if(sum < 0) {
							sum = sum + 26;
						}
						result += alphabet[sum];
					}
				}
			}
			System.out.println(result + "\n");
		}
		
		
	}

}
