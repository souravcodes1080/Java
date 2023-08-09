class RemoveVowels{
	public static void main(String[] args){
		String line = "HellO World";
		for(int  i = 0; i < line.length(); i++){
			char ch = line.charAt(i);;
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				continue;
			}
			System.out.print(ch);
		}
	}
}
