import java.util.Scanner;

/**
 * @author Andrew Herbert
 * @version May 13, 2019
 */
public class ShiftEncryptor {

	static String[] alphabet;
	
	/**
	 * Simply runs the other methods and prints the resulting text to the system console.
	 */
	public static void main(String[] args) {
		alphabet = new String[]{"a","b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		System.out.println("Please enter the text to encrypt without spaces. \n");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.print("Please enter the amount to shift them by.\n");
		int amountBy = scanner.nextInt();
		System.out.println(encrypt(text, amountBy));
		scanner.close();
	}
	
	/**
	 * Shifts String s by the amount int.
	 * @param s The pre-encrypted String.
	 * @param amount The amount to shift each entity in string s.
	 * @return The shifted string s.
	 */
	public static String encrypt(String s, int amount) {
		String result = "";
		s = s.toLowerCase();
		String[] sarray = s.split("");
		for(int i = 0; i < sarray.length; i++) {
			for(int k = 0; k < alphabet.length; k++) {
				if(sarray[i].equals(alphabet[k])) {
					int sum = k + amount;
					if(sum > 25) {
						sum = sum - 26;
					}
					result += alphabet[sum];
				}
			}
		}
		return result;
	}

}
