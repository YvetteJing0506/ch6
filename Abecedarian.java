public class Abecedarian {
	public static boolean isAbecedarian(String str) {
		int l = str.length();
		int i = 0;
		while (i<=l-2) {
			if (str.charAt(i)<str.charAt(i+1)) {i++;} 
			else {return false;}
		} return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isAbecedarian("linger") );
	}
}
