import java.util.Scanner;

public class ExchangeTempature
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		/* int로 불러오면, 소수점은 계산하지 않으므로, double로 불러온다. 정수를 입력해도 실수로 변환이 된다.*/
		double F = in.nextDouble();
		/* 만약 double 값을 계산하는 중, 하나라도 정수인 경우, 최종적으로 0.0으로 계산된다. 그로인해 모든 값들은 실수여야 한다. */
		double C = 5.0/9.0 * (F - 32.0);
		
		System.out.printf("%.1f", C);
	}
}
