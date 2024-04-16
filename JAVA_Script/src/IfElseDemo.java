import java.util.Scanner;

public class IfElseDemo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		/*만약에(number 변수와 2를 나눌 때 == 나머지가 0이라면)*/
		if (number % 2 ==0)
			/*아래의 실행문이 실행한다*/
			System.out.println("짝수");
		/*만약 아니라면*/
		else
			/*아래의 실행문이 실행한다*/
			System.out.println("홀수");
		/*해당 실행문은 if문에 해당하지 않는다.*/
		System.out.println("종료");
	}
}
