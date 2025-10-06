## study07
instanceof 연산자를 이용하여 상속 관계에따라 레퍼런스가 가리키는 객체의 타입을 알아본다. 실행 결과는 무엇인가?
```java
class Person() { }
class Student extends Person { }
class Researcher extends Person { }
class Professor extends Researcher { }

public class InstanceOfEx {
    static void print(Person p) {
        if(p instanceof Person)
            System.out.print("Person ");
        if(p instanceof Student)
            System.out.print("Student ");
        if(p instanceof Researcher)
            System.out.print("Researcher ");
        if(p instanceof Professor)
            System.out.print("Professor ");
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t");     print(new Student());
        System.out.print("new Researcher() ->\t");  print(new Researcher());
        System.out.print("new Professor() ->\t");   print(new Professor());
    }
}
```


<span style="color:lightGray">

실행결과
<br>new Student() -> Person Student
<br>new Researcher() -> Person Researcher
<br>new Professor() -> Person Researcher Professor
<br>
<br>
출처: Java 명품 Programming (p.281)
<br>
<br>
</span>

***
다음과 같은 클래스 계층 구조가 있을때, instanceof의 결과가 false인 것을 모두 골라라
```java
class A { }
class B extends A { }
class C extends A { }
class D extends C { }

A a;
B b = new B();
a = new D();
}
```
① if(b instanceof A)
<br>② if(a instanceof C)
<br>③ if(a instanceof java.lang.Object)
<br>④ if((new A()) instanceof D)
<br>⑤ if((new C()) instanceof A)
<br>⑥ if((new C()) instanceof C)
<span style="color:lightGray">

<span style="color:lightGray">
정답
<br>④
<br>해석
<br>④ - new A()를 통해 새로 생성하고, A는 D를 상속받지 않는다. (false)
<br>② - D는 C를 상속받았고, C는 A를 상속받았으니 D는 A로 업캐스팅 할 수 있다.
<br>
<br>
출처: Java 명품 Programming (p.282)
<br>
<br>
</span>