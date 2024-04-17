//연습문제 2-8

import java.util.Scanner;

public class AddNumbers
{
	public static void main(String[] args)
	{
	//	Scanner 클래스를 in 객체에 연결한다.
		Scanner in = new Scanner(System.in);
	
	//	Scanner로 입력을 받기 전, println으로 사용자에게 내용을 출력한다.
		System.out.println("0~999 사이 값을 입력하세요 : ");
		int i = in.nextInt();
		
	//	입력받은 정수에 100을 나눈 후 나머지를 버려, 3번째 자릿수를 얻는다.
		int THDdigit = i / 100;

	//	입력받은 정수에 100을 나눈 나머지에 10을 다시 나눠, 2번째 자릿수를 얻는다.
		int SECdigit = (i % 100) / 10;

	//	입력받은 정수에 10을 나눠 나머지를 이용해, 1번째 자릿수를 얻는다.
		int FSTdigit = (i % 10);
		
	//	얻은 3개의 자릿수를 전부 더해 하나의 결과를 리턴한다.
		int sum = THDdigit + SECdigit + FSTdigit;

		System.out.println("각 자릿수의 합"+sum);
	}
}
