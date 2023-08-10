class Calculator{
	public static void main(String args[]){
		float n1 = Float.parseFloat(args[0]);
		float n2 = Float.parseFloat(args[2]);
		switch(args[1]){
			case "+":
				System.out.println("Addition is: "+(n1+n2));
				break;
			case "-":                                                                                                                                                                       System.out.println("Subtraction is: "+(n1-n2));
				break;
			case "*":                                                                                                                                                                       System.out.println("Multiplication is: "+(n1*n2));
				break;
			case "/":                                                                                                                                                                       System.out.println("Division is: "+(n1/n2));
		}
	}
}
