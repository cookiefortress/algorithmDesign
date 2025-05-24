import java.util.ArrayList;

public class arrayDeduplication {
	public static ArrayList<Integer> deduplicateArray(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer num : arr) {
			if (!result.contains(num)) {
				// if there is no other instances of this index's value, then add it to the 'result' array which will be returned at the closing of this function
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// create an array and add numerous integers to it, including two duplicates, 5 and 50
		ArrayList<Integer> sample = new ArrayList<>();
		sample.add(1);
		sample.add(5);
		sample.add(10);
		sample.add(20);
		sample.add(5); // duplicate
		sample.add(50);
		sample.add(50); // duplicate

		// use the above array named 'sample', run deduplicateArray() on it and place the result in a variable named 'result'. then print it out to the terminal
		ArrayList<Integer> result = new ArrayList<>();
		result = deduplicateArray(sample);
		System.out.println(result);
	}
}