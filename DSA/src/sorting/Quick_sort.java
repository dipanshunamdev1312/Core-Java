package sorting;

public class Quick_sort {
	// Driven code
	public static void main(String[] args) {

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int N = arr.length;

		// function calling
		quickSort(arr, 0, N - 1);
		System.out.println("Sorted array:");

		printArr(arr);

	}

	// The main function that implements QuickSort
	// arr[] --> Array to be sorted,
	// low --> Starting index,
	// high --> Ending index
	static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place

			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);

		}

	}

	static int partition(int[] arr, int low, int high) {

		// Choosing the pivot
		int pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}

		}

		swap(arr, i + 1, high);
		return (i + 1);

	}

	static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
