## study12
### 메소드 오버라이딩
게임에서 무기를 표현하는 Weapon 클래스를 만들고 살상능력을 리턴하는 fire() 메소드를 작성하면 다음과 같다. fire()은 1을 리턴한다.

```java
class Weapon {
    protected int fire() {
        return 1; //무기는 기본적으로 한 명만 살상
    }
}
```
대포를 구현하기 위해 Weapon을 상속받는 Cannon 클래스를 작성하라. Cannon은 살상능력이 10이다.
<br>fire() 메소드를 이에 맞게 오버라이딩하라. main()을 작성하여 오버라이딩을 테스트하라.
```java
class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();
        
        weapon.fire();
    }
}
```

<br>코드 해석
```java
Shape p = start; ①
while (p != null) { ②
        p.draw(); ③
        p = p.next; ④
}
```
<br> 1. ①p = Line을 가리키는 참조값 x01
<br> 2. ②p 는 계속 변경된다. 
<br> 3. ③Line.draw() ...Rect.draw()..반복
<br> 4. ④next가 가리키는 다음 노드를 p에 넣어서 p가 null일 때 까지 반복한다. 

***

### 오버라이딩과 super 키워드 
super 키워드로 **정적 바인딩**을 통해 슈퍼 클래스의 멤버에 접근한다. 

