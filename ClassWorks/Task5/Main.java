
public class Main {

	public static void main(String[] args) {
		Rational rational = new Rational(5,2);
		rational.normalization();
		System.out.println(rational.normalization());
		
		Rational rational1 = new Rational();
		System.out.println(rational1.normalization());
		
	}

}
