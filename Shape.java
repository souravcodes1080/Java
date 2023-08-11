class Shape{
	double calculateVolume(float l, float w, float h){
		return (l * w * h);
	}
	double calculateVolume(float r){
		return(1.33 * 3.14 * (r*r*r));
	}
	double calculateVolume(float r, float h){
		return(0.33 * 3.14 * (r*r) * h);
	}


	public static void main(String args[]){
		Shape cube = new Shape();
		if(args.length == 3){	
			float l = Float.parseFloat(args[0]);
	                float l1 = Float.parseFloat(args[1]);
                	float l2 = Float.parseFloat(args[2]);
			System.out.print("The volume of cube: "+cube.calculateVolume(l, l1, l2));
		}
		else if(args.length == 1){
			float l1 = Float.parseFloat(args[0]);
			System.out.println("The volume of sphere is: "+cube.calculateVolume(l1));
		}
		else if(args.length == 2){
			float l1 = Float.parseFloat(args[0]);
                	float l2 = Float.parseFloat(args[1]);
			System.out.println("The volume of cone is: "+cube.calculateVolume(l1, l2));
		}
		else{
			System.out.println("Invalid argument, enter 3 arguments for cube, 2 arguments for cone, 1 argument for sphere.");
		}
	}
}
