//연습문제 4-1+2

class Triangle
{
	//	연습문제 4-1
	double width;
	double height;
	double area;
	
	//	생성자를 만들어 다른 메서드에서 변수를 가져오도록 한다.
	//	Triangle 클래스의 변수의 이름과 매개변수의 이름이 같은 경우
	//		=>this 필드변수를 클래스 변수 앞에 붙혀 구분하게 만든다.
	public Triangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	//	findArea 메서드를 만들어 area을 리턴하도록 한다.
	double findArea()
	{
		area = 0.5 * width * height;
		return area;
	}
	//	연습문제 4-2
	//
	//	Triangle 클래스를 불러와 findArea를 쓰게 한다.
	boolean isSameArea(Triangle t)
	{
	//	this 필드변수로 명령문을 사용하는 객체를 정의하고
	//		=>매게변수로 지정할 다른 객체를 정의한다.
		double area1 = this.findArea();
		double area2 = t.findArea();
	//	boolean으로 같으면 True, 다르면 False를 리턴하게 한다.
		return area1 == area2 ;
	}
}

public class Triangles
{
	public static void main(String[] args)
	{
	//	연습문제 4-1
	//		
	//	Triangle t = new Triangle(10.0, 5.0);
	//
	//	System.out.println(t.findArea());
	
	//	연습문제 4-2
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
