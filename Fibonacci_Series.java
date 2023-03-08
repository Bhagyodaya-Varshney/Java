class Area{
	void area( int height,int width){
		int ar= height*width;
		System.out.print("Area of Rectangle:"+ar);
		}
	void area( int side){
		int ar= side*side;
		System.out.print("Area of Square:"+ar);
		}
	void area( float r){
		float ar =3.14f*r*r;
 		System.out.print("Area of Circle:"+ar);
		}
	}
class Method_Overloading{
	public static void main(String [] args){
		Area obj = new Area();
		obj.area(12);	
		obj.area(5,6);
		obj.area(2.2f);
	}	
}