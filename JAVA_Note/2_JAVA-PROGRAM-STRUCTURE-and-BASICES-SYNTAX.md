# 자바 프로그램 기본 구조와 기초 문법

## 자바 프로그램 기초 구조


자바 프로그램의 구조는 다음과 같다.

```
클래스(Class)
=>  개발된 프로그램 단위, 스크립트 당 1개 이상은 있어야 하며, 
    한 개의 클래스가 소스파일 이름과 같아야 한다.
{
    메서드(Method)
    =>  수행할 작업이 나열된 코드들의 모임, 'main' 메서드는 무조건 있어야 한다.
    {
        실행문(Executable Statrment)
        =>  작업을 시작하는 (변수 선언, 값 저장, 메서드 호출등의) 코드.
        /* 주석문 */
        =>  프로그램을 설명하는 주석. 컴파일러가 무시하고 진행함
    }
}
```


이 구조를 자바프로그램을 예시로 들자면...

> Hello.java
```
/*
콘솔에 'Hello World!'을 출력하는 프로그램
*/

public class Hello
/* {public/private}으로 메서드 내 변수가 수정되어도 되는지 안되는지를 결정함. */
{
    public static void main(String[] args)
    /* {public/private} {static/dynamic} [void/String/int/double...] 등등 설정 가능한 것이 여러 있음
    {
        /* 메서드 내부, "System.out.println" 실행문은 괄호 안 내용을 출력해준다. */
        System.out.println("Hello World!");
    }
}
```

...과 같다.


