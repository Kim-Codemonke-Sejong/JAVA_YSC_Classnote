//4-6 예제

class Circle
{
	double radius;
	String color;
	
	//생성자도 오버로드로 불러올 수 있다. 아래는 그 예시이다.
	

	//1번 생성자: 임의의 반지름과 임의의 색상을 가짐
	public Circle(double r, String c)
	{
		radius = r;
		color = c;
	}
	
	//2번 생성자: 임의의 반지름과 "파랑"의 색상을 가짐
	public Circle(double r)
	{
		radius = r;
		color = "파랑";
	}
	
	//3번 생성자: "10.0"의 반지름과 임의의 색상을 가짐
	public Circle(String c)
	{
		radius = 10.0;
		color = c;
	}
	
	//4번 생성자: "10.0"의 반지름과 "빨강"의 색상을 가짐
	public Circle()
	{
		radius = 10.0;
		color = "빨강";
	}
}

public class CircleThdDemo
{
	public static void main(String[] args)
	{
		
		//두 변수가 임의인 1번 생성자를 불러온다
		Circle c1 = new Circle(10.0, "빨강");
		
		//color 변수가 지정된 2번 생성자를 불러온다
		Circle c2 = new Circle(5.0);
		
		//radius 변수가 지정된 3번 생성자를 불러온다
		Circle c3 = new Circle("노랑");
		
		//두 변수가 지정된 4번 생정자를 불러온다
		Circle c4 = new Circle();
	}
}
