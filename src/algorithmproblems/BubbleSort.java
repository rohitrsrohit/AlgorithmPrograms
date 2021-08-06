package algorithmproblems;
import java.util.Scanner;

public class BubbleSort{

	public static void main(String[] args) {

		int[] intArray = { 100, 200, 300, 400, 500, 600, 700 };

		int number;
		int start, end;
		int mid;

		System.out.println("Given sorted Array is :");
		for (int i : intArray) {
			System.out.println(i + ",");
		}
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to Search");
		number = scanner.nextInt();

		start = 0;
		end = intArray.length - 1;
		mid = (start + end) / 2;

		while (start <= end) {
			if (intArray[mid] == number) {
				System.out.println("Element found at " + mid + "index");
				break;
			} else if (intArray[mid] < number) {
				start = mid + 1;
			} else {
				end = mid - 1;
             }
			mid = (start + end) / 2;
		}

	}

}
