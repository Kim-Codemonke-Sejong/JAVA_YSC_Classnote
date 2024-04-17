//4-1 예제

//	Phone 클래스 생성
//	클래스들은 new 연산자를 통해 메소드나 변수 등을 공유 할 수 있다.
class Phone
{
	//	클래스 안에서도 변수를 정의할 수 있다. 
	//		=>주로 메소드를 여러개 쓸 때 사용한다.
	//
	//	String 변수만 대문자임! int double로 인해 햇갈릴 수 있음!
	String model;
	int value;

	//	변수들을 받아 출력해주는 메소드를 생성한다.
	void print()
	{
		System.out.println(value + "만 원짜리" + model + "스마트폰");
	}
}

public class PhoneDemo
{
	public static void main(String[] args)
	{
		//	new 연산자를 이용해 Phone 클래스를 myPhone에 대입한다.
		Phone myPhone = new Phone();

		//	변수를 대입하고, print(); 메소드로 출력한다.
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.print();
		
		//	new 연산자를 이용해 Phone 클래스를 yourPhone에 대입한다.
		Phone yourPhone = new Phone();

		//	변수를 대입하고, print(); 메소드로 출력한다.
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}
