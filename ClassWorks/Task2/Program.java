
public class Program {

	public static void main(String[] args) {
		int a = 4;
		int b = 15;
		int c = sum(a,b);
		System.out.println(c);
	}
		
		
		public static int sum(int a, int b) {
			int sum = 0;
			for (int i = a; i < b ; a ++){
				sum += i;
			}
			return sum;
		}
}