//4-9 예제

class Circle
{

	double radius;
	
	//	해당 변수는 정적변수다. 클래스 하나에서만 기억을 가지고 있어, 
	//	다른 객체가 사용해도 초기화되지 않는다.
	static int numOfCircles = 0;
	int numCircles = 0;

	//	생성자를 이용해 원의 개수를 카운트한다.
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

		System.out.println("원의 개수 : " + Circle.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}

	void print()
	{
		System.out.println("인스턴스 메서드입니다.");
	}
}
