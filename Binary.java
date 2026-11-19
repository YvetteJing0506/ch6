public class Binary {
	public static void main(String[] args) {
		System.out.println(convertToBinary(7));
	}
	
	public static String convertToBinary(int num) {
		String ans ="";
		int remainder;
		while (num>0) {
			remainder = num%2;
			num = num/2;
			ans = remainder + ans;
		} return ans;
	}
}
