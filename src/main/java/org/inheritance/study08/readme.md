## study08
상속에 있어 생성자에 대해 묻는 문제이다. 실행될 때 출력되는 내용은 무엇인가? 
```java
class A {
    public A() { System.out.println("A"); }
    public A(int x) { System.out.println("A" + x); }
}
class B extends A{
    public B() { super(100); }
    public B(int x) { System.out.println("B" + x); }
}
public class Example {
    public static void main(String[] args) {
        B b = new B(11);
    }
}
```
<span style="color:lightGray">
실행결과
<br>A
<br>B11
<br>
<br> 해석
<br> B클래스로 가서 B(int x) 생성자를 호출하고 상속받은 A로가서 기본 생성자를 호출한다. 
<br> A클래스에서 기본 생성자를 실행하고 B로 리턴해서 B(int x)생성자를 실행한다. 

출처: Java 명품 Programming (p.316)
<br>
<br>
</span>