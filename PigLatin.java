public class PigLatin {
	public static void main(String[] args) {
		System.out.println(pigLatin("I love starcraft"));
	}
	
	public static String pigLatin(String s) {
		for (
	}
	
	public static String pigLatinWord(String msg) {
		String ans = "";
		if (msg.length()>2) {
			ans = msg.substring(1,msg.length()) + msg.charAt(0) + "ay";
		} else {
			ans = msg;
		} return ans;
	}
}
