public class WhileDemo
{
	public static void main(String[] args)
	{
		int i = 0;
		/*i가 100미만일 시 => 반복 실행, i가 100 이상일 시 =>다음 실행문을 실행*/
		while(i<100){
			System.out.printf("%d ",i);
			/*i 변수에 정수 1을 추가*/
			i++;
		}
	}
}
