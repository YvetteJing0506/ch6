public class PPAP {
	public static void main(String[] args) {
		System.out.println(ppap("I have a pen, I have a pineapple"));
	}
	public static String ppap(String str) {
		String object1 = str.substring(9,findIndex(str, ','));
		String object2 = str.substring(findLastIndex(str, ' '), str.length());
		return "Uh! " + object2 + " " + object1 + ".";
	}
	public static int findIndex(String str, char c) {
		int a = 0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==c) {
				a = i;
			}
		} return a;
	}
	public static int findLastIndex(String str, char c) {
		int b = 0;
		for (int i = str.length()-1; i>=0; i--) {
			if (str.charAt(i)==c) {
				b=i+1;
				break; 
			} 
		} return b;
	}
}
