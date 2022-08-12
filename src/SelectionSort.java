
public class SelectionSort {
	public void sort(int arr[]) {
		for (int i = 0;i<arr.length-1;i++) {     //  4 , 2 , 3 , 1 , 5
			int min_idx = i;
			for (int j=i+1;j<arr.length;j++)
				if(arr[j] < arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
	}
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 4 , 2 , 1 , 3 , 5,0};
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		ob.printArray(arr);
		
	}
	

}
