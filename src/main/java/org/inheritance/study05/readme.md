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
(1) A objA = new objA();에 의해 생성되는 객체 objA의 멤버들을 모두 나열하라. // private int a; public 
<br/>(2) B objB = new objB();에 의해 생성된느 객체 objB의 멤버들을 모두 나열하라. // a, b, c
<br/>(3) C objC = new objC();에 의해 생성되는 객체 objC의 멤버들을 모두 나열하라. // a, b, c, d, e
<br/>(4) 클래스 D를 다음과 같이 작성하였을 때, 오류가 발생하는 라인을 모두 찾아라. // ① - a는 private 으로 자신 외 접근불가
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

