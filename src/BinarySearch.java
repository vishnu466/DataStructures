public class BinarySearch {
	public int binarySearch(int arr[],int low,int high,int x) {
		if(high>=low) {
			int mid = low + (high - low)/2;
			if(arr[mid] == x) 
				return mid;
			if(arr[mid] > x)
				return binarySearch(arr, low, mid-1, x);
			return binarySearch(arr, mid+1, high, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = {1,8,9,10,45,66,88};
		int high = array.length -1;
		BinarySearch obj = new BinarySearch();
		int result = obj.binarySearch(array, 0, high,88);
		if(result == -1) 
			System.out.println("The element not found");
		else
			System.out.println("The element found at index "+result);
	}

}
