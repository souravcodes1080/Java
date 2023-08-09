class Vowels{
	public static void main(String args[]){
		String st = "i love icecream";
		for(int i = 0; i < st.length(); i++){
			if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
				System.out.print(st.charAt(i));  
			}
		}
	}
}

