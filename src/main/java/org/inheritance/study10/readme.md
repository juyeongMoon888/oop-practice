## study10
다음 상속 관계의 클래스들이 있다. 
```java
class A {
    int i;
}
class B extends A{
    int j;
}
class C extends B{
    int k;
}
class D extends B{
    int m;
}
```
(1) 다음 중 업캐스팅을 모두 골라라
<br> ① A a = new A();
<br> ② B b = new C();
<br> ③ A a = new D();
<br> ④ D d = new D();

(2) 다음 코드를 실행한 결과는? 
```java
A x = new D();
System.out.println(x instanceof B);
System.out.println(x instanceof C);
```

(3) 다음 코드를 실행한 결과는?
```java
System.out.println(new D() instanceof Object);
System.out.println("Java" instanceof Object);
```


<span style="color:lightGray">
정답
<br> (1) ②, ③ 
<br> (2) true 
<br>     false
<br> (3) true 
<br>     true

출처: Java 명품 Programming (p.318)
<br>
<br>
</span>