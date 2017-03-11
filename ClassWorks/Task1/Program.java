
public class Program {

	public static void main(String[] args) {
		int [] array = { -3, 10, 11, 12, 15, -5};
		int min = array[0];
		int max = array[0];
		int minPosition = 0;
		int maxPosition = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max){
				max = array[i];
				maxPosition = i;
			}
			else if (array[i] < min){
				min = array[i];
				minPosition = i;
			}
		}
		int temp = 0;
		temp = array[minPosition];
		array[minPosition] = array[maxPosition];
		array[maxPosition] = temp;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}