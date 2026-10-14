public class findSqrt {
	public static double squareRoot (double i) {
		double x = i/2; double xn = (x + i/x)/2;
		System.out.println("guess: " + x);
		while (Math.abs(x-xn)>=0.0001) {
			System.out.println("trial: " + xn);
			x=xn;
			xn = (xn + i/xn)/2;
		} return xn;
	}
	
	public static void main(String[] args) {
		System.out.println("final answer" + squareRoot(9));
	}
}
