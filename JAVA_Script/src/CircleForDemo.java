//4-9 예제

class Circle
{
	double radius;
	
	//정적 변수
	static int numOfCircles = 0;
	int numCircles = 0;

	public Circle(double radius)
	{
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}

public class CircleForDemo
{
	public static void main(String[] args)
	{
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);

		//print(); <<정적 메서드이기 때문에, 호출이 불가능하다.
		System.out.println("원의 개수 : " + Circle.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}

	void print()
	{
		System.out.println("인스턴스 메서드입니다.");
	}
}
