class Test{
	void area( int height,int width){
		int ar= height*width;
		System.out.println("Area of Rectangle:"+ar);
		}
	void area( int side){
		int ar= side*side;
		System.out.println("Area of Square:"+ar);
		}
	void area( float r){
		float ar =3.14f*r*r;
 		System.out.println("Area of Circle:"+ar);
		}
	}
public class Method_Overloading{
	public static void main(String [] args){
		Test obj = new Test();
		obj.area(12);	
		obj.area(5,6);
		obj.area(2.2f);
	}	
}