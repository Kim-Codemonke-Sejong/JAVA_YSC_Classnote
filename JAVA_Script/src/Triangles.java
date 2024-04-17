//연습문제 4-1

class Triangle
{
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
}

public class Triangles
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(10.0, 5.0);

		System.out.println(t.findArea());
	}
}
