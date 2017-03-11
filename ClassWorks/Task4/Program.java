import java.util.Random;

class Program {
	public static void main(String[] args) {
		Random random = new Random();
		int ages [] = new int [1000];
		for (int i = 0; i < ages.length -1; i ++) {
			ages[i] = random.nextInt(120);
		}
		getResult(ages);
	}

	private static void getResult(int [] ages) {
		for (int i = 0; i < ages.length; i++) {
			int counter = 0;
			for (int j = 0; j < ages.length - 1; i ++) {
				int sum = ages[i];
				if (ages[j] == sum) {
					counter ++;
				}
			}
			System.out.println("Людей с возрастом " + i + "всего " + counter);
		}
	}
}
