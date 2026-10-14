public class evaluateEXP {
	public static double gauss(double x, int n) {
		double sum = 0; double termvalue; int i = 0; int posneg; int factorial = 1;
		while (i < n) {
			if (i%2==0) {posneg=1;} else {posneg=-1;}
			termvalue = posneg*Math.pow(x, 2*i)/factorial;
			i++;
			factorial *= i;
			sum += termvalue;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("sum equals = " + gauss(10, 23));
	}
}
