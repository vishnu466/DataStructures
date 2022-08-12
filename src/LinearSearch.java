

public class LinearSearch {
	
	public int Search(int arr[],int x){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return x;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = {2,4,1,7,5,3};
		LinearSearch linear = new LinearSearch();
		int result = linear.Search(array, 7);
		if(result == -1) {
			System.out.println("The element not found");
		}
		else {
		System.out.println("The Element "  + result + " is found");
		}
	}

}
