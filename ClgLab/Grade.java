import java.util.Scanner;
class Grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		if( marks > 100 || marks < 0 )
			System.out.println("Invalid marks");
		else if( marks >= 90 )
			System.out.println("Outstanding"); 
		else if( marks < 90 && marks >=80 )                                                                                                                                            	System.out.println("Excellent");
		else if( marks < 80 && marks >=70 )                                                                                                                                             System.out.println("Good");
		else if( marks < 70 && marks >= 60 )                                                                                                                                            System.out.println("Average");
		else if( marks < 60 && marks >= 50 )                                                                                                                                            System.out.println("Poor");
		else if( marks < 50)
			System.out.println("Fail");
	}
}

