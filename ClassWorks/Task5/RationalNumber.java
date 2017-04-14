
public class Rationalnumber {
	double numerator;
	double denominator;
	
	Rationalnumber (int nume, int denom) {
		numerator = nume;
		denominator = denom;
	}
	Rationalnumber () {
		numerator = 5;
		denominator = 2;
	}
	
	double normalization () {
		double result = numerator / denominator;
		
		return result;
	}

}
