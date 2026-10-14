public class evaluateEXP {
	public static double gauss(double x, double n) {
		int i=0; int posneg; int divideby; int power=0;
		while (i < n) {
			//term is positive or negative
			if (i%2=0) {pos-neg=1} else {posneg=-1}
			if (i=0) {divideby=1} else {divideby=i}
			posneg*Math.pow(x, 2*power)/divideby;
			//calculation after each run
			i++; power++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		gauss(5, 6);
		System.out.println("sum equals = " + sum);
	}
}
