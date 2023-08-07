import java.util.Scanner;
class ArrayEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array Data: ");
        for(int i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter search value:");
        int b =sc.nextInt();
        int flag = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == b){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}