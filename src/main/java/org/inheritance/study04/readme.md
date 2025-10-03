## study04

super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하는 예를 만든다.
```java
실행 결과
blue(5,6)
```

### SOLID 원칙 접목
- 다수의 하위 클래스가 공통점을 찾아 상위 클래스를 구성하진 않음 -> SRP를 만족한다고 하기엔 애매함
- Point 클래스에 ColorPoint외 다른 클래스로 확장될 수 있음 -> OCP 만족
- Point.set()는 Point 클래스 멤버인데 ColorPoint에서 사용할 수 있으니 LSP 만족
- ISP 무관
- DIP 무관
