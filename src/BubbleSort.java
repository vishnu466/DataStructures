
public class BubbleSort {
	
	public void bubblesort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j = 0; j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}//4,8,2,9,20,10,1
			}
		}
	}
	
	void printArray(int arr[]) {
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {4,8,2,9,20,10,1};
		BubbleSort obj = new BubbleSort();
		obj.bubblesort(arr);
		
		obj.printArray(arr);
	}

}
