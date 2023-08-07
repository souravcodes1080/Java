import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Size of array:- ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("\nEnter "+size+" Elements:- ");
        for(int i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = size-1;
        while(i < j){
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < size; k++){
            System.out.print(a[k]+" ");
        }
    }
}
