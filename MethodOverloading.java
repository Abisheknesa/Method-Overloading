package newas;
import java.lang.*;

public class MethodOverloading {
	
	public void area(float radius)
	{
    float area_circle=3.14f*radius*radius;
    System.out.println("AREA OF CIRCLE: "+area_circle);
    }
	
	public void area(int length,int breadth)
	{
		int area_rectangle=length*breadth;
		System.out.println("AREA OF RECTANGLE: "+area_rectangle);
	}
	
	public void area(int side) {
	int area_square=side*side;
	System.out.println("AREA OF SQUARE: "+area_square);
	}

	public static void main(String[] args) {
		
		MethodOverloading ml=new MethodOverloading();
		ml.area(8,5);
		ml.area(10);
	}
}