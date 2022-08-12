
public class InsertionSort {
	
	void sort(int arr[]) {
		int temp;
		for(int i = 1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	static void printArray(int arr[]) {
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
		
		}
	}
		

	public static void main(String[] args) {
		int arr[] = {6,4,2,3,1,5};
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		System.out.println("Sorted Array : ");
		printArray(arr);
	}

}
