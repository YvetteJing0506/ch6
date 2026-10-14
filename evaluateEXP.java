public class evaluateEXP {
	public static double gauss(double x, double n) {
		double sum = 0; double termvalue; int i = 0; int posneg; int divideby = 1; int power = 0;
		while (i < n) {
			//term is positive or negative
			if (i%2==0) {posneg=1} else {posneg=-1}
			//divide by how much
			if (i>0) {divideby *= i}
			//calculation
			termvalue = posneg*Math.pow(x, 2*power)/divideby;
			//calculation after each run
			i++; power++;
			sum += termvalue;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("sum equals = " + gauss(5, 6));
	}
}
