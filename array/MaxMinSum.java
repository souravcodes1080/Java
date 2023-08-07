class MaxMinSum{
	public static void main(String[] args){
		int[] a = {2,6,4,22,1,7,-9};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++){
			if( a[i] > max){
				max = a[i];
			}
			if( a[i] < min){
				min = a[i];
			}
		}
		System.out.println("\nSum of "+min+" and "+max+" is "+(max+min));
	}
}
