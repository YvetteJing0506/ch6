public class PigLatin {
	public static void main(String[] args) {
		System.out.println(pigLatin("I love car"));
	}
	
	public static String pigLatin(String s) {
		int count = 0;
		String answer = "";
		for (int i=0; i<s.length(); i++) {
			if (s.substring(i, i+1).equals(" ")) {
				count++;
			} 
		} 
		if (count==0) {
			answer = wordToPigLatin(s);
		} else {
			while (s.indexOf(" ")!=0) {
			String word = s.substring(0, s.indexOf(" "));
			answer += wordToPigLatin(word) + " ";
			s = s.substring(s.indexOf(" ")+1);
			} 
		} return answer;
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
