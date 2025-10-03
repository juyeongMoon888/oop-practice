## study02

(x,y)의 한 점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는 
ColorPoint 클래스를 만들고 활용해보자

```java
실행 결과
(1,2)
red(3,4)
```

### SOLID 원칙 접목
- 다수의 하위 클래스가 공통점을 찾아 상위 클래스를 구성하진 않음 -> SRP를 만족한다고 하기엔 애매함 
- Point 클래스에 ColorPoint외 다른 클래스로 확장될 수 있음 -> OCP 만족
- Point.set()는 Point 클래스 멤버인데 ColorPoint에서 사용할 수 있으니 LSP 만족
- ISP 무관
- DIP 무관
