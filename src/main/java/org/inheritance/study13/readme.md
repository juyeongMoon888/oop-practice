## study13 
1. private 메소드는 오버라이딩할 수 있는가?
<br>
2. 다음 프로그램의 실행 결과에 무엇이 출력되는가?
```java
import javax.security.auth.Subject;

class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        draw();
        System.out.println("Super Object");
    }
}

class SubObject extends SuperObject {
    @Override
    public void paint() {
        super.draw(); //SuperObject.draw()
    }

    @Override
    public void draw() {
        System.out.println("Sub Object");
    }
}

public class sample {
    public static void main(String[] args) {
        SuperObject b = new SubObject();
        b.paint();
    }
}
```
3. 앞의 문제 2에서 main()을 다음과 같이 수정한다면 실행 결과 화면에 무엇이 출력되는가? 
```java
public static void main(String[] args) {
    SubObject b = new SubObject();
    b.paint();
}
```
***
[정답] 
<br>(1) private은 오버라이딩 할 수 없다. 오버라이딩은 상속 관계에서만 가능한데, private은 동일 클래스 내에서 접근 가능하다.
<br>(2) 
<br>Sub Object
<br>Super Object
<br>(3) 
<br>Sub Object
<br>Super Object
<br>[해석]
<br> (2)의 실행 결과 해석
<br>호출 흐름을 단계로 보면 

```java
1. b.paint() → SubObject.paint()
2. 그 안에서 super.draw() → SuperObject.draw() 호출
3. SuperObject.draw() 안 첫 줄의 draw(); ← 여기서 동적 바인딩으로 **SubObject.draw()**가 호출됨 (런타임 타입이 SubObject이기 때문)
4. SubObject.draw()가 "Sub Object" 출력 후 복귀
5. 이어서 SuperObject.draw()가 "Super Object" 출력
```
호출 시점의 실제 객체 타입(SubObject)을 기준으로 오버라이드된 메서드가 선택된다.
<br>SuperObject.draw() 내부에서의 draw()는 this.draw()와 같고, this는 여전히 SubObject 인스턴스 이므로 SubObject.draw()가 실행된다.
<br>
<br> (3)의 실행 결과 해석
<br> (2), (3)의 실행 결과가 같은 이유는 런타임 호출 타입이 같기 때문이다. 




출처: Java 명품 Programming (p.296)
<br>
<br>
</span>