public class MergeSort {
	int array[];
	int temparr[];

	void arrangementForSort(int arr[]) {
		this.array = arr;
		this.temparr = new int[arr.length];
		doMergeSort(0, arr.length - 1);
	}

	void doMergeSort(int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			doMergeSort(low, mid);
			doMergeSort(mid + 1, high);
			MergePart(low, mid, high);

		}

	}

	void MergePart(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temparr[i] = array[i];
		}
			int i1 = low; 
			int j = mid + 1;
			int k = low;
			while (i1 <= mid && j <= high) {
				if (temparr[i1] <= temparr[j]) {
					array[k] = temparr[i1];
					
					i1++;
				} 
				else {
					array[k] = temparr[j];
					
					j++;
				}
				k++;
			}
			while (i1 <= mid) {
				array[k] = temparr[i1];
				k++;
				i1++;
			}
			
		}
	

	public static void main(String[] args) {
		int arr[] = { 4, 1, 7, 3 };
		new MergeSort().arrangementForSort(arr);
		System.out.println("\nAfter sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
