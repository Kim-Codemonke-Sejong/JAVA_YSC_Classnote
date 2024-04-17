//예제 4-3
//	Circle 클래스 생성
//	해당 클래스는 main 클래스와 같은 다른 클래스에서 new 연산자로 불러올 수 있다.
class Circle
{
	//	사용될 변수와 메서드를 생성
	double radius;

	double findArea()
	{
		return 3.14 * radius * radius;
	}

	void show(double x, double y)
	{
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class CircleDemo
{
	//	main 메서드 생성
	public static void main(String[] args)
	{
	
	//	Circle 클래스를 myCircle에 임포트함
	
	//	불러와진 Circle 클래스는 main 클래스에서 myCircle이라는 명령문으로 사용가능
	//	클래스를 불러올 때, 이름 지정 조건은 없음
	//	클래스를 2번 이상 불러올 때, 불러오는 명령문이 전부 다른 이름이라는 조건하에 불러올 수 있음
	
	Circle myCircle = new Circle();
	
	//	Circle가 불러와진 myCircle 명령문을 통해 Circle에 작성한 변수와 메서드를 사용
	myCircle.radius = 10.0;

	myCircle.show(myCircle.radius, myCircle.findArea());
	}
}


