package algorithmproblems;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		String[] StringArray = { "good", "morning", "to", "all" };

		String words;
		int start, end;
		int mid;

		System.out.println("Given sorted Array is :");
		for (String i : StringArray) {
			System.out.println(i + ",");
		}
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to Search");
		words = scanner.next();

		start = 0;
		end = StringArray.length - 1;
		mid = (start + end) / 2;

		while (start <= end) {
			if (StringArray[mid].equals(words)) {
				System.out.println("Word found at " + mid + "index");
				break;
			} else if (StringArray[mid].compareTo(words) < 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

	}

}
