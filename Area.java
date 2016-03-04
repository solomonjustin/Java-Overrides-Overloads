package Lab1;

public class Area {
	
	//overloaded methods
	public static void getArea(double radius){
		System.out.printf("Area of circle: %f\n", Math.PI * Math.pow(radius, 2));
	}
	
	public static void getArea(double radius, int height){
		System.out.printf("Area of cylinder: %f\n", Math.PI * Math.pow(radius, 2) * height);
	}
	
	public static void getArea(int width, int length){
		System.out.printf("Area of rectangle: %d\n", width * length);
	}

}
