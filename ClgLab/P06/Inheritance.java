class Figure{
	double area(){
		return 0.0;
	}

}
class Circle extends Figure{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	double area(){
		return 3.14 * radius * radius;
	}

}
class Triangle extends Figure{
	double height, base;
       	Triangle(double height, double base){
       		this.height = height;
	       this.base = base;	
	}
	double area(){
		return 0.5 * base * height;
	}
       		
}
class Rectangle extends Figure{
	double length, width;
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	double area(){
		return length * width;
	}
}
class Square extends Figure{
	double length;
	Square(double length){
		this.length = length;
	}
	double area(){
		return length * length;
	}
}
public class Inheritance{
	
	public static void main(String args[]){
	

		switch(args[0]){
			case "circle": 
				System.out.println("\n--------------------AREA OF CIRCLE------------------- ");
            			double radius = Double.parseDouble(args[1]);    		
                      		Circle c = new Circle(radius);
               			System.out.println("\nThe area of the circle is: "+c.area());
				 System.out.println("\n----------------------------------------------------\n");
				break;
					
			case "triangle":
				System.out.println("\n-------------------AREA OF TRIANGLE------------------- ");
				double height = Double.parseDouble(args[1]);
				double base = Double.parseDouble(args[2]);
				Triangle t = new Triangle(height, base);
				System.out.println("\nThe area of Triangle is: "+t.area());
				 System.out.println("\n----------------------------------------------------\n ");
				break;

			case "rectangle":
				System.out.println("\n--------------------AREA OF RECTANCLE------------------- ");
		                double length = Double.parseDouble(args[1]);
		                double width = Double.parseDouble(args[2]);
                		Rectangle r = new Rectangle(length, width);
		                System.out.println("\nThe area of Triangle is: "+r.area());
				 System.out.println("\n----------------------------------------------------\n");

				break;

			case "square":
				System.out.println("\n---------------AREA OF SQUARE------------------- ");
                		double side = Double.parseDouble(args[1]);
		                Square s = new Square(side);
                		System.out.println("\nThe area of Square is: "+s.area());
				System.out.println("\n----------------------------------------------------\n ");

				break;
			default:
				System.out.println("Enter correct values");
			}
	}
}
