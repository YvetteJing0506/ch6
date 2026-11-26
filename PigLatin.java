public class PigLatin {
	public static void main(String[] args) {
		System.out.println(pigLatin("I love starcraft"));
	}
	
	public static String pigLatin(String s) {
		String answer = "";
		String word = "";
		while (s.indexOf(" ")>=0) {
		word = s.substring(0, s.indexOf(" "));
		answer += wordToPigLatin(word) + " ";
		s = s.substring(s.indexOf(" ")+1);
		} answer+=wordToPigLatin(s);
		  return answer;
	} 
	
	public static String wordToPigLatin(String w) {
		String ans = "";
		if (w.length()>2) {
			ans = w.substring(1,w.length()) + w.charAt(0) + "ay";
		} else {
			ans = w;
		} return ans.toLowerCase();
	}
}
