public class Scrabble {
	public static boolean canSpell(String t, String w) {
		int tilesIncludeWord=0;
		for (int i=0; i<=w.length()-1; i++) {
			if (countChar(t,t.charAt(i))<countChar(w,t.charAt(i))) {
				return false;
			}
		} return true;
	}
	
	//I dont undertsnad the logic
	//what I did before: 
	//int r = 0 //which records times that the tile include letter in word
	//if (countChar(t,t,charAt(i))>=countChar(w,t.charAt(i))) {
		//r++;
	//} return r==t.length()-1
	//I get false for all conditions
	
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
