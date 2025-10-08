## study11
동적 바인딩: 슈퍼 클래스의 메소드를 무시하고 서브 클래스에서 오버라이딩된 메소드가 무조건 실행되도록 한다.

오버라이딩의 목적, 다형성 실현
Line 클래스에서는 선을 그리는 기능
Circle 클래스에서는 원을 그리는 기능
Rect 클래스에서는 사각형을 그리는 기능 

```java
public class UsingOverride {
    public static void main(String[] args) {
        Shape start;
        Shape last;
        Shape obj;

        start = new Line(); // Line을 가리키는 참조값 x01
        last = start;
        obj = new Rect(); // Rect을 가리키는 참조값 x02
        last.next = obj;
        last = obj;
        obj = new Line();// Line을 가리키는 참조값 x03
        last.next = obj;
        last = obj;
        obj = new Circle();// Circle을 가리키는 참조값 x04
        last.next = obj;

        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
    }
}
```
<br>실행 결과
```java
Line
Rect
Line
Circle
```

<br>코드 해석
```java
Shape p = start; ①
while (p != null) { ②
        p.draw(); ③
        p = p.next; ④
}
```
1. ①p = Line을 가리키는 참조값 x01
<br> 2. ②p 는 계속 변경된다. 
<br> 3. ③Line.draw() ...Rect.draw()..반복
<br> 4. ④next가 가리키는 다음 노드를 p에 넣어서 p가 null일 때 까지 반복한다. 

