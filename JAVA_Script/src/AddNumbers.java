import java.util.Scanner;

public class AddNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("0~999 사이 값을 입력하세요 : ");
		int i = in.nextInt();
		
		/*3번째 자리는 100을 나눠 구할 수 있다.*/
		int THDdigit = i / 100;
		/*2번째 자리는 100을 나눠 남은 수에 다시 10을 나눠 구할 수 있다.*/
		int SECdigit = (i % 100) / 10;
		/*1번째 자리는 10을 나눠 남은 수에 다시 1을 나눠 구할 수 있다. */
		int FSTdigit = (i % 10) / 1;
		
		/*구해진 3개의 수를 전부 더한다.*/
		int sum = THDdigit + SECdigit + FSTdigit;

		System.out.println("각 자릿수의 합"+sum);
	}
}
