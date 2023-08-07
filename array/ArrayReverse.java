class ArrayReverse{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int i = 0;
        int j = a.length - 1;
        while(i < j){
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;

            i++;
            j--;
        } 
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
}
