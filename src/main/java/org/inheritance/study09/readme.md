## study09
다음 코드에서 생성자로 인한 오류를 찾아내어 이유를 설명하고 오류를 수정하라
```java
class A {
    private int a;
    proteced A(int i) { a = i; }
}
class B extends A{
    private int b;
    public B() { b = 0; }
}
```
<span style="color:lightGray">
해석
<br> 서브 클래스 B생성자와 짝을 맺을 A의 기본 생성자가 없다. (B 클래스에 에러메시지 뜸)

출처: Java 명품 Programming (p.316)
<br>
<br>
</span>