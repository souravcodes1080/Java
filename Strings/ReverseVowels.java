class ReverseVowels{
	public static void main(String args[]){
		String name = "hello world";
		char[] ch = name.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while( i < j ){
			while( ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' ){
				i++;
			}
			while( ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u' ){
                                j--;
                        }
			char temp = ch[j];
			ch[j] = ch[i];
			ch[i] = temp;
			i++;
			j--;
		}
		for(int k = 0; k < ch.length; k++){
			System.out.print(ch[k]);
		}
	}
}
