package newSet;

public class Searching {

	public static void main(String[] args) {
		int[] nums = {2,12,7,11,3,0,4,1,9};
		int target = 7;
		int anotherTarget = 99;
		
		int[] sortedNums = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(sequentialSearch(nums, target));
		System.out.println(binarySearchLoop(sortedNums, target));
		System.out.println(binarySearchRecursive(sortedNums, target, 0, sortedNums.length - 1));
	}
	
	public static int sequentialSearch(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearchLoop(int[] arr, int number) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
   
		while (low <= high) {
			mid = (low + high) /2;
		       
		    if (number == arr[mid]) {
		        return mid;
		    }
		    else if (number < arr[mid]) {
		        low = mid - 1;
		    }
		    else { 
		    	low = mid + 1;
		    }
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] arr, int number ,int low, int high){
	    int mid = (low + high) / 2;
	    
	    if(arr == null || low > high) {
	    	return -1;
	    }

	    if(arr[mid] == number) {
	    	return mid;
	    }

	    if(number > arr[mid]) {
	        return binarySearchRecursive(arr, number, mid + 1, high);
	    }
	    if(number < arr[mid]) {
	        return binarySearchRecursive(arr, number, low, mid - 1);
	    }
	    return -1;
	}
	
	
}
