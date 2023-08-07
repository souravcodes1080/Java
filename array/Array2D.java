class Array2D{
    public static void main(String args[]){
        int[][] array = new int[3][4];
        System.out.println(array.length); 
        System.out.println(array[0].length); 

        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array[0].length; j++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}