public class Scrabble {
	public static boolean canSpell(String t, String w) {
		int tilesIncludeWord=0;
		for (int i=0; i<=w.length()-1; i++) {
			if (countChar(t,t.charAt(i))>=countChar(w,t.charAt(i))) {
				tilesIncludeWord++;
			}
		} return tilesIncludeWord==t.length()-1;
	}
	
	public static int countChar(String s, char c) {
		int count=0;
		for (int i=0; i<=s.length()-1; i++) {
			if (s.charAt(i)==c) {
				count++;
			}
		} return count;
	}
	
	public static void main(String[] args) {
		System.out.println(canSpell("quijibo", "jib"));
	}
}
