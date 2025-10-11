## study14
### 추상 클래스
다음 코드에서 틀린 부분이 있으면 고쳐라.
<br>(1)
```java
class A {
    void f();
}
```
(2)
```java
abstract class A {
    void f(){};
}
class B extends A {}
```
(3)
```java
abstract class A {
    void f() {};
}
class B extends A {
    void f() {}

    public static void main(String[] args) {
        A a = new A(); 
        a.f();
        B b = new B();
        b.f();
    }
}
```
<br>
<br>
[정답]
<br>(1) f() 메서드의 코드가 없으므로 abstract void f(); 로 고쳐야하며 그러면 class A도 abstract class A로 수정되야 한다.
<br>(2) 틀린 부분이 없다.
<br>-메서드 본문(중괄호{...})이 있으면 구현된 메서드이다.
<br>-따라서 f()는 구현된 메서드이기 때문에, 서브 클래스 B가 오버라이드할 의무가 없다.
<br>(3)
<br>- abstract 클래스는 객체를 생성할 수 없다. (A a = new A();)
<br>- 따라서 접근조차 될 수 없다.(a.f();)
<br>
<br>출처: Java 명품 Programming (p.301)
<br>
<br>