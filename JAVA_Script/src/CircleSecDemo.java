//4-5 예제

class Circle
{
	private double radius;
	
	
	//	생성자는 메소드와는 다르게, 클래스 이름과 같아야 한다.
	//	만약 생성자를 만들지 않는다면, 디폴트 생성자가 만들어져, new 연산자로 호출되게 만든다.
	//	여기서는 생성자를 만들어, 디폴트 생성자는 만들어지지 않는다.
	public Circle(double r)
	{
		radius = r;
	}

	// public Circle(double r) << 일반 메서드로 지정되어, 컴파일 오류를 발생시킨다.
	// {
	// 	radius = r;
	// }
}

public class CircleSecDemo
{
	public static void main(String[] args)
	{
		Circle myCircle = new Circle(10.0);

	//	출력을 하는 명령문이 없기 때문에, 실행시키면 출력문이 나오지 않는다.
	}
}
