public class Palindrome {
	public static void main(String[] args) {
		String str = "Amy, must I jujitsu my ma?";
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		str = onlyLetters(str);
		if (str.equals(reverse(str)) ) {
			return true;
		} return false;
	} 
	public static String onlyLetters(String str) {
		String nonLetters = ",.:;()[]{}!?/<>@#$%^&* ";
		String onlyL = "";
		for (int i=0; i<str.length(); i++) {
			if (!nonLetters.contains(str.substring(i,i+1))) {
				onlyL+=str.charAt(i);
			}
		} return onlyL.toLowerCase();
	}
	public static String reverse(String str) {
		String r = "";
		for (int i=str.length()-1; i>=0; i--) {
			r+=str.charAt(i);
		} return r;
	}
}
