## study05

다음 클래스에 대한 물음에 답하라
```java
class A {
    private int a; 
    public void set(int a) {
        this.a = a; 
    }
}
class B extends A {
    protected int b, c;
}
class C extends B {
    protected int d, e;
}
```
(1) A objA = new objA();에 의해 생성되는 객체 objA의 멤버들을 모두 나열하라.
<br/>(2) B objB = new objB();에 의해 생성된느 객체 objB의 멤버들을 모두 나열하라.
<br/>(3) C objC = new objC();에 의해 생성되는 객체 objC의 멤버들을 모두 나열하라. 
<br/>(4) 클래스 D를 다음과 같이 작성하였을 때, 오류가 발생하는 라인을 모두 찾아라.
```java
class D extends C {
    public void f() {
        a = 1; ①
        set(10); ②
        b = 20; ③
        d = 30; ④
    }
}
```

***
<span style="color:lightGray"> 
[정답] 
<br>(1) private int a;
<br> public void set(int a) {this.a = a;}
<br> (2) private int a;
<br>public void set(int a) {this.a = a;}
<br> protected int b, c;
<br> (3) private int a;
<br> public void set(int a) {this.a = a;}
<br> protected int b, c;
<br> public int d, e;
<br> (4) a = 1;
<br> 
<br> [해설]
<br> 서브 클래스는 슈퍼 클랙스와 서브 클래스의 멤버를 모두 갖는다.
<br> a는 private으로 선언되었기 때문에 자신(A.class) 외 클래스에서 접근할 수 없다. 
<br>
<br>
<br>
출처: Java 명품 Programming (p.314)
<br>
<br>
</span>

***
다음과 같이 2차원 상의 한 점을 표현하는 Point 클래스가 있다.
```java
class Point {
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```
Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하여 실행 결과와 같이 출력되게 하라.

```java
public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 5, "RED");
    cp.setXY(10, 20);
    cp.setColor("BLUE");
    String str = cp.toString();
    System.out.println(str + "입니다.");
}
```
