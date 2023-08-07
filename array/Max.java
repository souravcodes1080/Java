import java.util.Scanner;
class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Size of array:- ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("\nEnter array Elements:- ");
        for(int i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        System.out.print("\nThe maximum value is: "+ max);
        for(int i = 0; i < size; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.print("\nThe maximum value is: "+ max);
    }
}