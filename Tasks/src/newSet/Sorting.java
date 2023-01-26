package newSet;

public class Sorting {

	public static void main(String[] args) {
		int[] numbers = {5,9,4,7,3,8,2,1};
		int len = numbers.length - 1;
		
		Sorting sort = new Sorting();
		System.out.println("QuickSort");
		sort.quickSort(numbers, 0, len);
		printArray(numbers);
		
		System.out.println("MergeSort");
		sort.mergeSort(numbers, 0, numbers.length - 1);
		printArray(numbers);
		
		System.out.println("Selection Sort");
		sort.selectionSort(numbers);
		printArray(numbers);
	}
	
	protected void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
	
	protected void mergeSort(int arr[], int left, int right)
    {
        if (left < right) {
            int middle = left + (right - left) / 2;
            
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            
            merge(arr, left, middle, right);
        }
    }
	
	protected void heapSort(int[] arr) {
		int length = arr.length;
		 
        // Build heap (rearrange array)
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(arr, length, i);
 
        // One by one extract an element from heap
        for (int i = length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
	}
	
	protected void selectionSort(int[] arr) {
		int length = arr.length;
		
		for(int i = 0; i < length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < length; j++) {
				if (arr[j] > arr[min]) {
					min = j;
				}
				
				int temp = arr[min];
				arr[min] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	private void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
	
	private void merge(int arr[], int left, int middle, int right)
    {
        int one = middle - left + 1;
        int two = right - middle;
 
        int L[] = new int[one];
        int R[] = new int[two];
 
        for (int i = 0; i < one; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < one; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        
        while (i < one && j < two) {
        	
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < one) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < two) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	private int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        
        for(int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
            	i++;
            	
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
 
        return i + 1;
    }
	
	private static void printArray(int arr[])
    {
        int n = arr.length;
        
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
