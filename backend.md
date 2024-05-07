________
# <span style = "color:#ffd33d">back-end 전공과 친해지기</span>

<br><br>

# <span style = "color:orange">객체 지향의 특징</span>

### 객체 지향 프로그래밍의 장점
 객체 지향 프로그래밍은 프로그램을 보다 유연하고 변경이 용이하게 만들 수 있습니다. 각각의 부품들이 각자의 독립적인 역할을 가지기 때문에 코드의 변경을 최소화하고 유지보수 하는 데 유리합니다.<br>
<span style = "color:skyblue">**반복적인 코드를 최소화하고, 코드를 최대한 간결하게 표현할 수 있다**</span>는 장점이 있습니다.<br>

### 객체 지향 프로그래밍의 4가지 특징
1. **추상화**<br>
 추상이라는 용어는 '사물이나 표상을 어떤 성질, 공통성, 본질에 착안하여 그것을 추출하여 파악하는 것'이라는 의미를 가지고 있습니다.<br>
 ex. 지하철 노선표<br>
 객체지향 프로그래밍에서 의미하는 추상화는 객체의 공통적인 속성, 기능을 추출하여 정의하는 것을 의미합니다.<br>
2. **상속**<br>
 상속은 기존의 클래스를 재활용하여 새로운 클래스를 작성하는 자바 문법 요소를 의미합니다.<br>
 추상화의 연장선에서 상속은 클래스 간에 공유 될 수 있는 속성, 기능들을 상위 클래스로 추상화 시켜 상위 클래스로부터 확장된 여러 개의 하위 클래스들이 모두 상위 클래스의 속성과 기능들을 간편하게 사용할 수 있도록 합니다.<br>
 클래스들 간의 공유하는 속성, 기능을 한 번만 정의해두고 재사용할 수 있다는 장점이 읶습니다.
3. **다형성**<br>
 다형성은 어떤 객체의 속성, 기능이 상황에 따라 여러 형태를 가질 수 있는 성질을 의미한다고 합니다.<br>
 ex. 사람 -> 부모, 팀장, 친구가 될 수 있음<br>
 객체 지향에서 다형성은 어떤 객체의 속성이나 기능이 그 상황과 맥락에 따라 다른 역할을 수행할 수 있는 객체 지향의 특성입니다.<br>
ex. 매서드 오버라이딩, 메서드 오버로딩<br>
4. **캡슐화**<br>
 캡슐화는 클래스 안에 서로 연관있는 속성과 기능을 하나의 캡슐로 만들어 데이터를 외부로부터 보호하는 것을 의미합니다.<br>
 객체 지향 프로그래밍에서 캡슐화 하는 이유는 크게 두 가지가 있습니다.<br>
   1. **데이터 보호** : 외부로부터 클래스에 정의된 속성, 기능들을 보호<br>
   2. **데이터 은닉** : 내부의 동작을 감추고 외부에는 필요한 부분만 노출
<br><br>
 위와 같이 데이터 보호, 데이터 은닉을 하는 이유는 각 개체의 <span style = "color:skyblue">**고유 독립성, 책임 영역을 안전하게 지키고자 하는 목적**</span>이 있기 때문입니다.<br>

#### 캡슐화를 구현하기 위한 두 가지 방법
1. ***접근제어자 활용***<br>
 클래스 또는 클래스 내부의 멤버들에게 사용, 해당 클래스나 멤버들을 외부에서 접근하지 못하도록 접근을 제한하는 역할<br>
 자바의 경우
    1. **Private** : 클래스 내에서만 접근 가능
    2. **Default** : 동일 패키지 내에서만 접근 가능
    3. **Protected** : 동일 패키지, 다른 패키지의 하위 클래스에서 접근 가능
    4. **Public** : 접근 제한 없음<br>

1. ***getter/setter 메서드***<br>
 선택적으로 외부에 접근을 허용할 속성과 그렇지 않을 속성을 getter/setter 메서드를 통해 설정해줄 수 있습니다.
<br><br>

캡슐화를 사용하면 객체 내부의 동작으로 외부의 노출을 최소화하여 객체의 자율성을 높이고, 객체 간 결합도를 낮춰 <span style = "color:skyblue">**객체 지향의 이점을 잘 살리는 방법**</span>으로 프로그램을 설계하는 일이 가능합니다.<br><br><br>
________
# <span style = "color:#ffd33d">자바 클래스 선언과 사용 </span>

```java
package backend;

public class Test01{

    // 필드
    String name;
    int age;
    int korean_score;
    int math_score;
    int english_score;
    
    // 생성자
    public Test01(String name, int age, int korean_score, int math_score, int english_score){
        this.name = name;
        this.age = age;
        this.korean_score = korean_score;
        this.math_score = math_score;
        this.english_score = english_score;
    }
    
    // 메소드
    public void printScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어 성적 : " + korean_score);
        System.out.println("수학 성적 : " + math_score);
        System.out.println("영어 성적 : " + english_score);
    }
}

class Main{
    public static void main(String[] args){
        Test01 test = new Test01("홍길동", 18, 100, 90, 80);
        test.printScore();
    }
}
```

<br><br><br>


________
# <span style = "color:#ffd33d">HTTP Method란?</span>
<br><br>

# <span style = "color:orange">HTTP Method</span>
 클라이언트 - 서버 구조에서 요청과 응답이 이루어지는 방식을 의미합니다.
 서버가 수행해야 할 동작을 지정해, 요청을 보내는 방법입니다.<br>
 HTTP 메서드를 사용하는 이유는 <span style = "color:skyblue">**리소스와 동작을 분리하기 위해서**</span>인데, HTTP 메서드를 통해 서버가 수행해야 할 동작을 지정하면, URI는 리소스만 식별하면 되기 때문입니다.<br><br>

### HTTP Method 종류
***8가지의 method***<br>

 **GET** : 리소스를 조회<br>
 
 **POST** : 데이터 추가 및 등록<br>
 
 **PUT** : 리소스 대체, 수정 / 해당 리소스가 없으면 새롭게 생성<br>
 
 **DELETE** : 리소스 삭제<br>
 
 **PATCH** : 리소스 부분 변경(수정)<br>

 **HEAD** : GET과 동일하지만 HTTP 메세지의 body 부분을 제외하고 조회<br>

 **OPTIONS** : 서버와 브라우저가 통신하기 위한 통신 옵션을 확인
 - 서버가 어떤 method, header, content-type을 제공하는지 알 수 있음<br>
 
 **CONNECT** : 대상 자원으로 식별되는 서버에 대한 요청<br>