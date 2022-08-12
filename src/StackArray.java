
public class StackArray {
	
	static int max = 100;
	static int top;
	static int a[] = new int[max];
	
	public StackArray() {
		top = -1;
	}
		
	void  push(int d) {
		if(top >= (max - 1)) {
			System.out.println("stack overflow");
		}
		else {
			System.out.println("-->"+top);
			a[++top] = d;
			System.out.println("-->"+top);
			System.out.println(d+ " is pushed into the stack");
			
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			System.out.println("--"+top);
			int x = a[top--];
			System.out.println("--"+top);
			return x;
		}
		
	}
	public static void printStack() {
		System.out.println("Elements in the stack are : ");
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(1);
		s.push(2);
		s.push(3);
		printStack();
		System.out.println(s.pop()+ " is poped out of the stack");
		printStack();
	}

}
