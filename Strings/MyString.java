import java.util.Scanner;
class MyString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name.charAt(2));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println("Size: "+ name.length());
	}
}

