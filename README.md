    202330232 최재헌

# 정수 리터럴
    15 -> 10진수
    015 -> 0으로 시작하면 8진수, 10진수로 13
    0x15 -> 0x로 시작하면 16진수, 10진수로 21
    0b0101 -> 0b로 시작하면 2진수, 10진수로 5

## Long 타입으로 지정할땐 
    long i = 24l; 이런식으로 l이나 L을 붙이면 된다

## 실수 리터럴
    실수 리터럴은 소수점 형태나 지수형태로 실수를 표현한 값
    예: 12. 12.0 .1234 0.1234 1234E-4

## 실수 리터럴은 double타입으로 자동 처리되며 변수와 함꼐 사용하면 된다
    double d = 0.1234;
    double e = 1234E-4; <- 1234E-4 = 1234x10<sup>-4</sup>이므로 0.1234와 동일

## 숫자 뒤에 f또는 F를 붙이면 float으로 d 또는 D를 붙이면 double타입으로 강제 변환 할수있다
    float f = 0.1234f; <- 0.1234는 원래 double타입이므로 
    double w = .1234D; <- .1234D와 .1234는 동일

# 문자 리터럴
    문자 리터럴은 단일 인용부호('')로 문자를 표현하거나 \u 다음에 문자의 유니코드값을 사용하여 표한한다 
    예: 'a', 'W', '가’, '3', '글'

    변수와 함께쓰면
    char a = 'W';
    char b = '글';
    char c = \uae00; <- 글의 유니코드 값 ae00을 \u뒤에 사용

# 특수문자 리터럴
    백슬래쉬(\) 다음에 특수 기호를 붙여서 표한하는데 이를 이스케이프 시퀸스(escape sequence)라고 한다

    종류
    '\b' <- 백스페이스
    '\t' <- 탭
    '\n' <- 라인피드(줄바꿈)
    '\f' <- 폼피드(커서를 다음 페이지의 시작부분으로 넘김)
    '\r' <- 캐리지 리턴(커서를 다음줄로 넘기지 않고 첫 번째 위치로 넘김)
    '\"' <- 큰따옴표
    '\'' <- 작은따옴표
    '\\' <- 백슬래쉬(역슬래쉬)

# null 리터럴
    null은 기본 타입에 사용하지못하고 객체 레퍼런스에 대입된다

## null은 int,double,boolean등과 같은 기본타입에 적용불가

    String str = null; <- 이런식으로 사용

# 문자열(String) 리터럴
    "hello"와 같이 큰따옴표에 묶어서 표현한다
    String str = "hello";

# var 키워드
    java10부터 var키로드를 사용하여 타입을 생략하고 간단히 변수선언 가능
    var키워드는 자동으로 타입 결정

## 초깃값이 주어지지 않으면 오류 발생
## 지역 변수로만 사용가능

# 상수 
    리터럴을 상수로 선언하면 변수처럼 표현 가능
    상수는 final키워드를 사용하여 선언

    final double PI = 3.141592;
    final -> 상수선언
    double -> 데이터 타입
    PI -> 상수 이름
    3.141592 -> 이 값으로 초기화

## final키워드를 사용할땐 앞에 static을 붙여줘야 좋다

# 타입변환

## 자동 타입 변환
    다음과 같이 치환문(=)이나 타입이 일치하지 않을 때 컴파일러는 작은 타입을 큰 타입으로 자동변환
    long m = 24; <- 25는 int타입으로서 long타입으로 자동변환
    double d = 3.14 * 10; <- 실수를 연산하기위해 10.0으로 자동변환

 ## 강제 타입 변환
    int n = 300;
    작은 타입에서 큰타입으로 변환 가능
    큰 타입에서 작은타입으로 변환하면 컴파일러는 오류를 발생시킨다

    손실이 발생한다는걸 알고도 강제 변환하려면 
    byte b = (byte)n;
    이처럼 괄호안에 타입을 넣어서 강제 변환이 가능하다

## 강제 타입 변환을 캐스팅(casting)이라고도 부른다.

## if문 종류

# 다중 if-else문 

    if(조건식1) {
        실행문장 1;
    }
    else if(조건식 2) {
        실행문장 2;
    }
    else if(조건식 3) {

    }

## FourSeasons.java 참고
## FourSeasons.java 참고
## FourSeasons.java 참고

# 중첩 if-else문

    if안에 if를 넣는 방식 

# Switch문

    switch(식) {
    case 값1:
        실행 문장 1;
        break;
    case 값2:
        실행 문장2;
        break;
        ...
    case 값m:
        실행 문장 m;
        break;
    default:
        실행 문장 n;
    }

# switch문에서 break문의 역할

    switch문 내의 break문
        break문을 만나면 switch문 벗어남
        case문에 break문이 없다면, 다음 case문으로 실행 계속
        break를 만날 때까지 계속 내려 가면서 실행 

# case 문의 값
        문자, 정수, 문자열 리터럴(JDK 1.7부터)만 허용
        실수 리터럴은 허용되지 않음

#
        int b;
        switch(b%2) {
            case 1: ...; break;
            case 2: ...; break;
        }

        char c;
        switch(c) {
            case '+': ...; break;
            case '+': ...; break;
        }

        String s ="예";
        switch(s){
            case "예" ...; break;
            case "아니오" ...; break; 
        }

# 반복문 

    자바 반복문 - for 문, while 문, do-while 문

    for 문 - 가장 많이 사용하는 반복문 


## while 문의 구성과 코드 사례

    while(조건식) {
        작업문
    }

    조건식이 '참'인 동안 반복 실행

    예시
    it i=0;
    while(i<10) {
        System.out.print(i);
        i++;
    }

# 자바 배열

    배열(array)
        인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조 
            배열을 이용하면 한 번에 많은 메모리 공간 선언 가능

# 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간

            원소 데이터들이 순차적으로 저장됨
            인덱스를 이용하여 원소 데엍 접근
            반복문을 이용하여 처리하기에 적합한 자료 구조

# 배열 인덱스
            0부터 시작
            인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치 

## 배열 선언과 생성
        (1) 배열에 대한 레퍼런스 변수 intArray 선언

            int intArray [];

        (2) 배열 생성

            intArray = new int [5];

## 배열 선언 및 생성 디테일

    배열 선언
        int intArray [];

        int[] intArray;

    배열 생성 
        intArray = new int[5];

        int intArray[] = new int[5];

    배열 초기화
        int intArray[] = {4, 3, 2, 1, 0};

## 배열 인덱스
        배열의 인덱스는 0 ~ *배열 크기-1
            int intArray = new int[5];
            intArray[0] = 5;
            intArray[3] = 6;
            int n = intArray[3];

        인덱스를 잘못 사용한 경우
            int n = intArray[-2];
            int m = inArray[5];

        반드시 배열 생성 후 접근
            int intArray []; //레퍼런스만 선언함

            intArray[1] =8; //오류. 배열이 생성되어 있지 않음
        
# h1
## h2
안녕나안안앙난안앙난아  
안녕나여낭영녀여

일반 글씨는 그냥 작성
개행(newline)은 스페이스 2개

*이텔릭체*  
**굵게**  
***이텔릭+굵게***

## 리스트(list)
1. 첫 번째  
2. 두 번째  
3. 세 번째  

## 코드블럭
```java
public class main(String[] args) {
  System.out.println("hello world");
}
```

```python
print("하이티비")
```

## 링크
[구글 링크](https://google.co m) <!-- [화면에 보이는내용](이동할 url) -->

[리스트](#리스트list) <!-- [보이는 글](#이동할 위치) -->
<!-- html의 id와 동일 누르면 이동 -->

![댕댕이](./img/dog.jfif) <!-- ![html의 alt와 같이 이미지가 안보일때 보이는 글](이미지 경로) -->
<!--이미지 띄우기 html의 <img>태그도 사용 가능 -->

# 정수 리터럴
15 -> 10진수
015 -> 0으로 시작하면 8진수, 10진수로 13
0x15 -> 0x로 시작하면 16진수, 10진수로 21
0b0101 -> 0b로 시작하면 2진수, 10진수로 5

## Long 타입으로 지정할땐 
long i = 24l; 이런식으로 l이나 L을 붙이면 된다

## 실수 리터럴
실수 리터럴은 소수점 형태나 지수형태로 실수를 표현한 값
예: 12. 12.0 .1234 0.1234 1234E-4

## 실수 리터럴은 double타입으로 자동 처리되며 변수와 함꼐 사용하면 된다
double d = 0.1234;
double e = 1234E-4; <- 1234E-4 = 1234x10<sup>-4</sup>이므로 0.1234와 동일

## 숫자 뒤에 f또는 F를 붙이면 float으로 d 또는 D를 붙이면 double타입으로 강제 변환 할수있다
float f = 0.1234f; <- 0.1234는 원래 double타입이므로 
double w = .1234D; <- .1234D와 .1234는 동일

# 문자 리터럴
문자 리터럴은 단일 인용부호('')로 문자를 표현하거나 \u 다음에 문자의 유니코드값을 사용하여 표한한다 
예: 'a', 'W', '가’, '3', '글'

변수와 함께쓰면
char a = 'W';
char b = '글';
char c = \uae00; <- 글의 유니코드 값 ae00을 \u뒤에 사용

# 특수문자 리터럴
백슬래쉬(\) 다음에 특수 기호를 붙여서 표한하는데 이를 이스케이프 시퀸스(escape sequence)라고 한다

종류
'\b' <- 백스페이스
'\t' <- 탭
'\n' <- 라인피드(줄바꿈)
'\f' <- 폼피드(커서를 다음 페이지의 시작부분으로 넘김)
'\r' <- 캐리지 리턴(커서를 다음줄로 넘기지 않고 첫 번째 위치로 넘김)
'\"' <- 큰따옴표
'\'' <- 작은따옴표
'\\' <- 백슬래쉬(역슬래쉬)

# null 리터럴
null은 기본 타입에 사용하지못하고 객체 레퍼런스에 대입된다

## null은 int,double,boolean등과 같은 기본타입에 적용불가

String str = null; <- 이런식으로 사용

# 문자열(String) 리터럴
"hello"와 같이 큰따옴표에 묶어서 표현한다
String str = "hello";

# var 키워드
java10부터 var키로드를 사용하여 타입을 생략하고 간단히 변수선언 가능
var키워드는 자동으로 타입 결정
## 초깃값이 주어지지 않으면 오류 발생
## 지역 변수로만 사용가능

# 상수 
리터럴을 상수로 선언하면 변수처럼 표현 가능
상수는 final키워드를 사용하여 선언

final double PI = 3.141592;
final -> 상수선언
double -> 데이터 타입
PI -> 상수 이름
3.141592 -> 이 값으로 초기화

## final키워드를 사용할땐 앞에 static을 붙여줘야 좋다

# 타입변환

## 자동 타입 변환
다음과 같이 치환문(=)이나 타입이 일치하지 않을 때 컴파일러는 작은 타입을 큰 타입으로 자동변환
long m = 24; <- 25는 int타입으로서 long타입으로 자동변환
double d = 3.14 * 10; <- 실수를 연산하기위해 10.0으로 자동변환

## 강제 타입 변환
int n = 300;
작은 타입에서 큰타입으로 변환 가능
큰 타입에서 작은타입으로 변환하면 컴파일러는 오류를 발생시킨다

손실이 발생한다는걸 알고도 강제 변환하려면 
byte b = (byte)n;
이처럼 괄호안에 타입을 넣어서 강제 변환이 가능하다

## 강제 타입 변환을 캐스팅(casting)이라고도 부른다.

# System.in
System.in은 표준 입력 스트림 객체로 키보드 입력을 받기위해 사용
System.in을 사용하면 읽은 바이터 정보를 문자나 숫자로 변환해야하는 번거로움이 있다
그래서 저수준(low-level)인 System.in보다 고수준(high-level)인 Scanner를 사용하는것이 좋다

# Scanner 객체 생성
Scanner sc = new Scanner(System.in);
이런식으로 sc라는 이름의 객체를 생성할수 있다

## Scanner객체는 System.in으로 하여금 키보드로 <br>입력을 받고 문자,문자열,정수,실수등으로 변환하여 리턴해준다

# Scanner 사용할떄 import
Scanner를 사용하기위해 java.util.Scanner를 import해야한다
예: import java.util.Scanner;

## Scanner 주요 메소드
각 타입별로 사용방법 {
  String next()
  byte nextByte()
  shor nextShort()
  int nextInt()
  long nextLong()
  float nextFloat()
  double nextDouble()
  boolean nextBoolean()
  String nextLine ->두줄 입력하면 첫번째 라인만 scanner객체에 저장
  void close() 
  boolean hasNext() -> 입력할게 있으면 true를 반환하고 아니면 false를 반환
}

## 배열 리턴
    배열의 레퍼런스만 리턴(배열 전체가 리턴되는 것이 아님)

# 메소드의 리턴 타입
    리턴하는 배열 타입과 리턴 받는 배열 타입 일치
    리턴 타입에 배열의 크기를 지정하지 않음

int [] intArray;

intArray = makeArray();

## 예외(Exception)
    실행 중 오동자이나 결과에 악영향을 미치는 예상치 못한 상황 발생

# 예외 처리
    발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것
    try-catch-finally문 사용
        finally 블록은 생략 가능

try{
        에외가 발생할 가능성이 있는 실행문(try 블록)
}
catch (처리할 예외 타입 선언) {
    예외 처리문(catch 블록)
}
finally {
    예외 발생 여부와 상관없이 무조건 실행되는 문장(finally 블록)
}

# try 블록에서 예외가 발생하지 않은 정상적인 경우

try{
    ....
    실행문
    ....
}
catch(처리할 예외 타입 선언) {

}
finally {
    finally 블록문
}

# 배열의 범위를 벗어나 원소를 접근하는 예외 처리

ArrayIndexOutOfBoundsException 예외

## Division.java를 참고 ## 
## Division.java를 참고 ## 
## Division.java를 참고 ## 

## 기본 생성자
    매개 변수 없고, 아무 작업 없이 단순 리턴하는 생성자


## this 레퍼런스

# this
객체 자신에 대한 레퍼런스
    컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
    this.멤버 형태로 멤버를 접근할 때 사용

## 접근 지정자 

    4가지 

    private, protected, public, 디폴트(접근지정자 생략)

# 접근 지정자의 목적
    클래스나 일부 멤버를 공개하여 다른 클래스를 접근하도록 허용

    객체 지향 언어의 캡슐화 정책은 멤버를 보호하는 것 
     접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적

# 클래스 접근지정
    다른 클래스에서 사용하도록 허용할 지 지정

    public 클래스
        다른 모든 클래스에게 접근 허용

    디폴트 클래스(접근지정자 생략)
    package-private라고도 함
    같은 패키지의 클래스에만 접근 허용 
    
## Static.java 참고 ##
## Static.java 참고 ##
## Static.java 참고 ##  

## Static 메소드의 제약 조건 1

# static 메소드는 오직 static 멤버만 접근 가능

    객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, not-static 멤버 활용 불가
    
    not-static 메소드는 static 멤버 사용 가능

# static 메소드의 제약 조건 2

    static 메소드는 this 사용불가
        static 메소드는 객체 없이도 사용 가능하므로, this 레퍼런스 사용할 수 없음 

## final 클래스와 메소드

    final 클래스 - 더 이상 클래스 상속 불가능

    final 메소드 - 더 이상 오버라이딩 불가능

## 클래스 상속과 객체

extends 키워드로 선언

부모 클래스 -> 슈퍼 클래스(super class)
자식 클래스 -> 서브 클래스(sub class)

        (슈퍼)           (서브)
class ColorPoint extends Point 

## Extends.java 참고 ##
## Extends.java 참고 ##
## Extends.java 참고 ##

## 자바 상속의 특징

# 클래스 다중 상속(multiple inheritance) 불허

    C++는 다중 상속 가능
        C++는 다중 상속으로 멤버가 중복 생성되는 문제 있음
        자바는 인터페이스의 다중 상속 허용

    모든 자바 클래스는 묵시적으로 Object클래스 상속받음
       java.lang.Object는 클래스는 모든 클래스의 슈퍼 클래스 

    슈퍼 클래스의 priviate 멤버
        서브 클래스에서 접근할 수 없음

    슈퍼 클래스의 디폴트 멤버
        서브 클래스가 동일한 패키지에 있을 때, 접근 가능

    슈퍼 클래스의 public 멤버
        서브 클래스는 항상 접근 가능

    슈퍼 클래스의 protected 멤버
        같은 패키지 내의 모든 클래스 접근 허용
        패키지 여부와 상관 없이 ~ 

## 서브 클래스/슈퍼 클래스의 생ㅅ어자 호출과 실행

# 서브 클래스의 객체가 생성될 때

    슈퍼클래스 생성자와 서브 클래스 생성자 모두 실행

    호출 순서
        서브 클래스의 생성자 먼저 호출
        서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출

    실행 순서
        슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행

## 서브 클래스와 슈퍼 클래스의 생성자 선택

# 슈퍼 클래스와 서브 클래스
        각각 여러 개의 생성자 작성 가능

# 서브 클래스의 객체가 생성될 때
        슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행

# 서브 캘래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
    1. 개발자의 명시적 선택
        서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택
        super() 키워드를 이용하여 선택

    2. 컴파일러가 기본생성자 선택
        서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우
        컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 선택 

## super()로 슈퍼 클래스의 생성자 명시적 선택

# super()
    서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 호출 

# 업캐스팅

    서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
    슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상

## 다운캐스팅

    다운캐스팅(downcasting)
        슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
        업캐스팅된 것을 다시 원래대로 되돌리는 것
        반드시 명시적 타입 변환 지정 

## 5월 3일 수업 내용 ##

## 컬렉션

# 요소라고 불리는 가변 개수의 객체들의 저장소 
        # 객체들의 컨테이너라고도 불림

        # 요소의 개수에 따라 크기 자동 조절

        # 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동

        # 고정 크기의 배열을 다루는 어려움 해소

        # 다양한  객체들의 삽입, 삭제, 검색 등의 관리 용이

## 컬렉션의 특징
    1. 컬렉션은 제네릭(generics) 기법으로 구현

        제네릭
            # 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나
              메소드를 일반화시키는 기법

            # 클래스나 인터페이스 이름에 <E>, <K>, <V> 등 타입매개변수 포함

        제네릭 컬렉션 사례 : 벡터 Vector<E>
            # <E>에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용

            # 정수만 다루는 컬렉션 벡터 Vector<Integer>

            # 문자열만 다루는 컬렉션 벡터 Vector<String>

    2. 컬렉션의 요소는 객체만 가능

        # int, char, double 등의 기본 타입으로 구체화 불가

        # 컬렉션 사례

            Vector<int> v = new Vector<int>(); // 컴파일 오류. int는 사용 불가
            Vector<Integer> v = new Vector<Integer>(); // 정상 코드

    # 제네릭의 기본 개념 (생략)

## Vector<E>
    
    ## 벡터 Vector<E>의 특성

        # <E>에 사용할 요소의 특정 타입으로 구체화

        # 배열을 가변 크기로 다룰 수 있게 하는 컨테이너
            배열의 길이 제한 극복
            요소의 개수가 넘치면 자동으로 길이 조절
        
        # 요소 객체들을 삽입, 삭제, 검색하는 컨테이너
            삽입, 삭제에 따라 자동으로 요소의 위치 조정

        # Vector에 삽입 가능한 것
            객체, null
            기본 타입의 값은 Wrapper 객체로 만들어 저장

        # Vector에 객체 삽입
            벡터의 맨 뒤, 중간에 객체 삽입 가능

        # Vector에서 객체 삭제
            임의의 위치에 있는 객체 삭제 기능
            
## 컬렉션 생성 문의 진화 : JAVA7 JAVA10

## VectorEx를 참고 ## 
## VectorEx를 참고 ## 
## VectorEx를 참고 ##

## ArrayList<E>

    # 가변 크기 배열을 구현한 클래스
    
        <E>에 요소로 사용할 특정 타입으로 구체화
    
    # 벡터와 거의 동일

        요소 삽입, 삭제, 검색 등 벡터 기능과 거의 동일
        
        벡터와 달리 스레드 동기화 기능 없음

## 컬렉션의 순차 검색을 위한 Iterator

    ## Iterator<E> 인터페이스

        # 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스
            Vector<E>, ArrayList<E>, LinkedList<E>가 상속받는 인터페이스

    ## Iterator 객체 얻어내기

        # 컬렉션의 iterator() 메소드 호출

            해당 컬렉션을 순차 검색할 수 있는
                Iterator 객체 리턴

        # 컬렉션 코드 검색

## IteratorEx를 참고 ##
## IteratorEx를 참고 ##
## IteratorEx를 참고 ##

### HashMap<K,V>

    ## 키(key)와 값(value)의 쌍으로 구성되는 요소를 다루는 컬렉션

        K : 키로 사용할 요소의 타입

        V : 값으로 사용할 요소의 타입

        키와 값이 한  쌍으로 삽입

        '값'을 검색하기 위해서는 반드시 '키' 이용

    ## 삽입 및 검색이 빠른 특징
    
        요소 삽입 : put() 메소드

        요소 검색 : get() 메소드

### 제네릭 만들기

    ## 제네릭 클래스 작성

        클래스 이름 옆에 일반화된 타입 매개 변수 추가
        
            public class MyClass<T> {
                T val;
                void set(T a) {
                    val = a;
                }
                T get() {
                    return val;
                }
            }

    ## 제네릭 객체 생성 및 활용

        재네릭 타입에 구체적인 타입을 지정하여 객체를 생성하는 것을 구체화라고 함

        MyClass<String> s = new MyClass<String>(); // T를 String으로 구체화
        s.set("hello");
        System.out.println(s.get()); // "hello" 출력

        MyClass<Integer> n = new MyClass <Interger> . . .

### 자바의 GUI(Graphical User Interface)

. . .

## MyFrame를 참고 ##
## MyFrame를 참고 ##
## MyFrame를 참고 ##

### 이벤트 기반 프로그래밍 

## 이벤트 기반 프로그래밍(Event Driven Programming)
    # 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식
        이벤트가 발생하면 이벤트를 처리하는 루틴(이벤트 리스너) 실행
        실행될 코드는 이벤트의 발생에 의해 전적으ㅡ로 결정
    # 반대되는 개념 : 배치 실행(batch programming)
        프로그램의 개발자가 프로그램의 흐름을 결정하는 방식
    # 이벤트 종류
        사용자의 입력 : 마우스 드래그, 마우스 클릭, 키보드 누름 등 
        센서로부터의 입력, 네트워크로부터 데이터 송수신
        다른 응용프로그램이나 다른 스레드로부터의 메시지
## 이벤트 기반 응용 프로그램의 구조
    # 각 이벤트마다 처리하는 리스너 코드 보유 
## GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성됨
    # GUI 라이브러리 종류
            C++의 MFC, C# GUI, Visual Basic, X Window, Android 등
            자바의 AWT와 Swing

### 자바 스윙 프로그램에서 이벤트 처리 과정
    ## 이벤트가 처리되는 과정
        # 이벤트 발생
            예 :마우스의 움직임 혹은 키보드입력
        # 이벤트 객체 생성
            현재 발생한 이벤트에 대한 정보를 가진 객체
        # 응용프로그램에 작성된 이벤트 리스너 찾기
        # 이벤트 리스너 실행
            리스너에 이벤트 객체 전달
            리스너 코드 실행 

### 자바의 이벤트 기반 스윙 응용프로그램의 구조와 이벤트 처리 과정 

화면상의 New 버튼에 마우스 클릭 - PC 등 하드웨어 - 운영체제 - 자바 가상 기계(JVM) - 이벤트 분배 스레드 - 이벤트 리스너4(객체를 생성) - 
JButton - 이벤트 소스 

### 이벤트 객체

    ## 이벤트 객체
        # 발생한 이벤트에 관한 정보를 가진 객체
        # 이벤트 리스너에 전달됨
            이벤트 리스너 코드가 발생한 이벤트에 대한 상황을 파알할 수 있게 함 

    ## 이벤트 객체가 포함하는 정보
        # 이벤트 종류와 이벤트 소스 
        # 이벤트가 발생한 화면 좌표 및 컴포넌트 내 좌표
        # 이벤트가 발생한 버튼이나 메뉴 아이템의 문자열
        # 클릭된 마우스 버튼 번호 및 마우스의 클릭 횟수
        # 키의 코드 값과 문자 값
        # 체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태

    ## 이벤트 소스를 알아 내는 메소드 
        # Object getSource()
            발생한 이벤트의 소스 컴포넌트 리턴
            Object 타입으로 리턴하므로 캐스팅하여 사용
            모든 이벤트 객체에 대한 적용 


                       EventObject
                            |
                        AWTEvent
                            |
    Action Event  -  ComponentEvent  -  ItemEvent
                            |
                       InputEvent
                      /          \
                     /            \
             MouseEvent          KeyEvent

### 리스너 인터페이스

    ## 이벤트 리스너
        이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성
    ## 자바는 다양한 리스너 인터페이스 제공
        예) ActionListener 인터페이스 - 버튼 클릭 이벤트를 처리하기 위한 인터페이스 


        예) MouseListener 인터페이스 - 마우스 조작에 따른 이벤트를 처리하기 위한 인터페이스 

    ## 사용자의 이벤트 리스너 작성
        자바의 리스너 인터페이스 (interface)를 상속받아 구현
        리스너 인터페이스의 모든 추상 메소드 구현

### 이벤트 리스너 작성 과정 사례

    ## 1. 이벤트와 이벤트 리스너 선택
        # 버튼 클릭을 처리하고자 하는 경우
            이벤트 : Action 이벤트, 이벤트 리스너 : ActionListener
    ## 2. 이벤트 리스너 클래스 작성 : ActionListener 인터페이스 구현

    ## 3. 이벤트 리스너 등록
        # 이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록
        # component.addXXXListener(listener)
            xxx : 이벤트 명, listener : 이벤트 리스너 객체 

### 이벤트 리스너 작성 방법
    
    ## 3가지 방법
        # 독립 클래스로 작성
            이벤트 리스너를 완전한 클래스로 작성
            이벤트 리스너를 여러 곳에서 사용할 때 적합
        # 내부 클래스(inner class)로 작성
            클래스 안에 멤버처럼 클래스 작성
            이벤트 리스너를 특정 클래스에서만 사용할 때 적합
        # 익명 클래스(anonymous class)로 작성
            클래스의 이름 없이 간단히 리스너 작성
            클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합 

### IndepClassListener.java 참고 ### 

### 익명 클래스로 이벤트 리스너 작성

    ## 익명 클래스(anonymous class) : 이름 없는 클래스
        (클래스 선언 + 인스턴스 생성)을 한번에 달성

        new 익명클래스의슈퍼클래스이름(생성자인자들) {
            익명클래스의 멤버 구현
        };

        # 간단한 리스너의 경우 익명 클래스 사용 추천
            메소드의 개수가 1, 2개인 리스너(ActionListener, ItemListener)에 대해 주로 사용

### 어댑터 클래스

    ## 이벤트 리스너 구현에 따른 부담
        리스너의 추상 메소드를 모두 구현해야 하는 부담
        예) 마우스 리스너에서 마우스가 눌러지는 경우(mousePressed())만 처리하고자 하는 경우에도 나머지 4개의 메소드를 모두 구현해야 하는 부담 

### Key 이벤트와 포커스 
    
    ## 키 입력 시, 다음 세 경우 각각 Key 이벤트 발생
        키를 누르는 순간
        누른 키를 떼는 순간
        누른 키를 떼는 순간(Unicode 키의 경우에만)
    ## 키 이벤트를 받을 수 있는 조건
        모든 컴포넌트
        현재 포커스(focus)를 가진 컴포넌트가 키 이벤트 독접
    ## 포커스(focus)
        컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
        컴포넌트에 포커스 설정 방법 : 다음 2라인 코드 필요 

### 유니코드(Unicode) 키

    ## 유니코드 키의 특징
        국제 산업 표준
        전 세계의 문자를 컴퓨터에서 일관되게 표현하기 위한 코드 체계
        문자들에 대해서만 키 코드 값 정의   
            A~Z, a~z, 0~9, !, @, & 등
        문자가 아닌 키 경우에는 표준화된 키 코드 값 없음
            <Function> 키, <Home> 키, <Up> 키, <Delete> 키, <Control> 키, <Shift> 키,
            <Alt> 등은 플랫폼에 따라 키 코드 값이 다를 수 있음

        ## 유니코드 키가 입력되는 경우
            keyPressed(), keyTyped(), keyReleased()가 순서대로 호출
        ## 유니코드 키가 아닌 경우
            keyPressed(), keyReleased()만 호출됨 
        
### 가상 키와 입력된 키 판별

    ## KeyEvent 객체
        입력된 키 정보를 가진 이벤트 객체
        KeyEvent 객체의 메소드로 입력된 키 판별

    ## KeyEvent 객체의 메소드로 입력된 키 판별
        char KeyEvent.getKeychar()
            키의 유니코드 문자 값 리턴
            Unicode 문자 키인 경우에만 의미 있음
            입력된 키를 판별하기 위해 문자 값과 비교하면 됨

    ## int KeyEvenet.getKeyCdoe()
        유니코드 키 포함
        모든 키에 대한 정수형 키 코드 리턴
        입력된 키를 판별하기 위해
        가상키(Virtual Key) 값과 비교하여야 함 
        가상 키 값은 KeyEvenet 클래스에 상수로 선언

### KeyCharEx.java 참고 ### 