class ArrayMax{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.print("\nMAx element: "+max);
	}
}
