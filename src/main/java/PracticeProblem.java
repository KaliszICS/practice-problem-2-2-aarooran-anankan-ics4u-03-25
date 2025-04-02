import java.util.Arrays;

public class PracticeProblem {
	public static void main(String args[]) {}

	public static int[] compareSearch(int[] array, int number) {

		Arrays.sort(array);

		int[] ansArr = {0, 0};
		
		for (int i = 0; i < array.length; i++) { //Seq
			ansArr[0] = i+1;
			if (array[i] == number) {
				i = array.length;
			}
		}

		int low = 0;
		int high = array.length - 1;
		int mid;

		while(low <= high) { //bin

			ansArr[1]++;

			mid = (high + low) / 2;

			if (number == array[mid]) {
				//ansArr[1] = mid;	
				low = high + 1;
			}
			else if (number > array[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		return ansArr;
	}

	public static int[] compareStringSearch(String[] array, String word) {

		Arrays.sort(array);

		int[] ansArr = {0, 0};
		
		for (int i = 0; i < array.length; i++) { //Seq
			ansArr[0] = i+1;
			if (array[i].compareTo(word)==0) {
				i = array.length;
			}
		}

		int low = 0;
		int high = array.length - 1;
		int mid;

		while(low <= high) { //bin

			ansArr[1]++;

			mid = (high + low) / 2;

			if (word.compareTo(array[mid])==0) {
				//ansArr[1] = mid;	
				low = high + 1;
			}
			else if (word.compareTo(array[mid])>0) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		return ansArr;
	}

}
