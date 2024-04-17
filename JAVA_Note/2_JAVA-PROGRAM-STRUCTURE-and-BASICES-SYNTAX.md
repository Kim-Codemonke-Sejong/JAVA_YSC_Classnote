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
        주석문(comment)
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
        //메서드 내부, "System.out.println" 실행문은 괄호 안 내용을 출력해준다.
        System.out.println("Hello World!");
    }
}
```

...과 같다.

## 식별자

프로그램에서 사용되는 **상수, 변수, 메서드, 클래스 등을 구별하는 이름**이다.

**식별자의 규칙**

- 문자<sub>(영어 대, 소문자)</sub>, 언더바<sub>(\_)</sub>, $로 시작해야 한다.

    `Cricle`, `_Test`, `$SHELL` 은 가능하나, `32Bar`, `ㄱIMPORTANT`, `#dOCS` 은 불가능하다.

- `+,-,*,\` 등 연산자는 포함될 수 없다. 

    `sum+sum`, `sub-` 은 불가능하다.

- [자바 키워드](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)는 사용 할 수 없다.

    `float`, `boolean`, `else` 은 불가능하다.

- 길이에 제한은 없다.

    'asdhfkjsahdfjkashdfjklsadfhkjlsadfhjkl' 은 가능하다.

**식별자를 잘 만드는 방법**

- 변수는 소문자로만 작성하나, 2글자 이상은 단어의 첫 자를 대문자로 작성한다.

    'shield', 'characterHealth', 'isEmpty' 정도가 적절하다.

- 메서드는 각 단어의 첫자만 대문자로 작성하고, 나머지는 소문자로 작성한다.
    
    'Critical', 'CircleDetect', 'PlayerStatus' 정도가 적절하다.

## 변수

메모리 공간 안에 데이터를 보관할 때, 구분하기 위해 사용되는 개념

**변수의 종류**

- 정수 : byte, short, int, long

- 문자 : char

- 실수 : float, double

- 논리 : boolean

