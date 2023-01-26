package newSet;

public class Sorting {

	public static void main(String[] args) {
		int[] numbers = {5,9,4,7,3,8,2,1};
		int len = numbers.length - 1;
		
		Sorting sort = new Sorting();
		sort.quickSort(numbers, 0, len);
		printArray(numbers);
	}
	
	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;
		
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
			}
			int swap = arr[i];
			arr[i] = arr[j];
			arr[j] = swap;
		}
		
		int swap = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swap;
		
		return i + 1;
	}
	
	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i = 0; i < n; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
	
	public void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partition = partition(arr, begin, end);
			
			quickSort(arr, begin, partition - 1);
			quickSort(arr, partition + 1, end);
		}
	}
}
