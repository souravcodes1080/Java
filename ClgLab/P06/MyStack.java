import java.util.Scanner;
class MyStack{
	int size, top;
	int[] stack;	
	
	MyStack(int size){
		this.size = size;
		top =-1;
		stack = new int[size];
	}

	void push(int n){
		if(isFull()){
			System.out.println("Overflow");
		}else{
			top++;
			stack[top] = n;
			System.out.println("Element pushed");
		}	
	}
	
	void pop(){
		if(isEmpty()){
			System.out.println("Underflow");
		}else{
			top--;
			System.out.println("Element poped");
		}
	}

	boolean isFull(){
		if(top == size-1){
			return true;
		}
		return false;
	}
	boolean isEmpty(){
		if(top == -1){
			return true;
		}
		return false;
	}
	void display(){
		if(isEmpty()){
			System.out.println("Stack empty");
		}
		else{
		
		
		for(int i = top; i >= 0; i--){
			System.out.println(stack[i]);
		}
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		MyStack stack = new MyStack(size);
		while(true){
		System.out.println("-----------------");
		System.out.println("| 0.Push     |\n| 1.Pop      |\n| 2.Display      |\nEnter choice:");
		System.out.println("-----------------");
		int ch = sc.nextInt();
			switch(ch){
				case 0:
					System.out.println("Enter value: ");
					int n = sc.nextInt();
					stack.push(n);
					break;
				case 1: 
					stack.pop();
					break;
				case 2:
					stack.display();
					break;
				default: 
					System.out.println("Enter correct choice!");
			}
		}

	}
}














































