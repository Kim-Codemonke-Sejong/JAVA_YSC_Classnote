public class MethodDemo
{
	public static void main(String[] args)
	{
		//	주석처리된 아래의 스크립트는 반복문이 3번 사용되었다.
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
	
	//	이 메서드로 3번의 반복작업이 1번으로 감소하였다.
	//	이렇게 메서드를 하나 만들면 반복작업이 많이 줄어든다. 
	public static int sum(int i1, int i2)
	{
		int sum = 0;
		for(int i = i1 ; i <= i2 ; i++)
			sum+=i;

		return sum;
	}
}
