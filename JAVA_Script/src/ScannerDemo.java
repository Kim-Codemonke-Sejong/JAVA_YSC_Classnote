//예제 2-7

//Scanner 클래스를 import하는 실행문.
import java.util.Scanner;

//소스파일 내 클래스 1개는 무조건 소스파일 이름과 똑같아야 함.
public class ScannerDemo
{
	//소스파일에는 무조건 main 메서드가 1개 있어야 한다.
	public static void main(String[] args)
	{
		//new 연산자로 Scanner 클래스를 in으로 불러온다.
		Scanner in = new Scanner(System.in);
		
		//x 와 y 변수를 int로 지정 후, 불러와진 Scanner 클래스 내 메서드로 사용자 입력을 하게 한다.
		int x = in.nextInt();
		int y = in.nextInt();
		
		//printf로 x와 y, x*y을 지정된 포맷에 따라 출력한다.
		System.out.printf("%d * %d 는 %d 입니다.",x ,y , x*y);
	}
}
