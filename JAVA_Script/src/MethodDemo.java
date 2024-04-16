public class MethodDemo
{
	public static void main(String[] args)
	{
		/*하단에서는 반복문이 3번 사용됨, 반복문 절약 가능.*/
		/*
		int sum = 0;
		for(int i = 0 ; i <= 10 ; i++)
			sum +=i;
		System.out.println("합(1~10) : "+sum);
		
		sum = 0;

		for(int i = 10 ; i <= 100 ; i++)
			sum +=i;
		System.out.println("합(10~100) : "+sum);
		
		sum = 0;
		
		for(int i = 100 ; i <= 1000 ; i++)
			sum +=i;
		System.out.println("합(10~1000) : "+sum);
		
		sum = 0;
		*/
		System.out.println("합 (1~10) : "+sum(1, 10));
		System.out.println("합 (10~100) : "+sum(10, 100));
		System.out.println("합 (100~1000) : "+sum(100, 1000));

	}
	/*이 메서드는 main 메서드에서 호출이 가능하다.*/
	public static int sum(int i1, int i2)
	{
		int sum = 0;
		for(int i = i1 ; i <= i2 ; i++)
			sum+=i;

		return sum;
	}
}
