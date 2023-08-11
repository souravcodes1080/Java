class Myconst{
	Myconst(int side){
		System.out.println("Area of square: "+(side*side));
	}
	Myconst(int length, int width){
		System.out.println("Area of rectangle: "+(length*width));
	}

	
	public static void main(String args[]){
		Myconst square = new Myconst(20);
		Myconst rectangle = new Myconst(20, 10);
	}
}
	
