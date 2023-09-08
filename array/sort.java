import java.util.Scanner;


class sort{
	
	void asort(int[] arr, int size){
		for(int i = 0; i < size;i++){
			for(int j = i+1; j < 5;j++){
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
			}
		}				
	}	

	void bsort(int[] arr, int size){
                for(int i = 0; i < size;i++){
                        for(int j = i+1; j < 5;j++){
                                if(arr[i] < arr[j]){
                                        int temp = arr[j];
                                        arr[j] = arr[i];
                                        arr[i] = temp;
                                }
                        }
                }
        }
		
		
	void print(int[] arr, int size){
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+" ");
		}
	}
		
	void read(int[] arr, int size){
		Scanner obj =new Scanner(System.in);
		for(int i = 0; i < size; i++){
			arr[i] = obj.nextInt();
		}
	}
	
	
	
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		sort s = new sort();
		System.out.println("\nEnter size: ");
		int size = obj.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		s.read(arr, size);
				
		s.asort(arr, size);
		System.out.println("Ascending Order: ");
		s.print(arr, size);
		
		s.bsort(arr, size);
		System.out.println("Decending Order: ");
                s.print(arr, size);
		
	}
}
