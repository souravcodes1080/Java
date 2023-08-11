class Room{
	int length;
	int width;
	Room(int length){
		//length = this.length;
		System.out.println("Area of square: "+sarea(length));
	}
	Room(int length, int width){
		this.length = length;
		this.width = width;
		System.out.println("Area of rectangle: "+rarea(length, width));
	}
	int sarea(int l){
		return l * l;
	}
	int rarea(int l, int w){
		return l * w;
	}
	
	public static void main(String args[]){
		Room square = new Room(20);
		Room rectangle = new Room(20, 10);
	}
}
	
