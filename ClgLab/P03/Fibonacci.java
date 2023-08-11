import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		int n1 = 0;
		int n2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n terms: ");
		int n = sc.nextInt();
		for(int i =0; i < n; i++){
			System.out.print(n1+" ");
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
