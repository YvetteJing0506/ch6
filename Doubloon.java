public class Doubloon {
	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		for (int i=0; i<=str.length()-1; i++) {
			if (countLetter(str, str.charAt(i)) == 2) {
				return true;
			}
		} return false;
	}
	
	public static int countLetter(String word, char letter) {
		int count=0;
		for (int i=0; i<=word.length()-1; i++) {
			if (word.charAt(i)==letter) {
				count++;
			}
		} return count;
	}
	
	public static void main(String[] args) {
		System.out.print(isDoubloon("like"));
	}
	
	
		
}
