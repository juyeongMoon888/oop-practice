# study02

#### 상속 관계에 있는 클래스 간 멤버 접근

클래스 Person을 아래와 같은 필드를 갖도록 선언하고, 클래스 Student는 Person을 상속받아 각 멤버 필드에 값을 저장하라. 

- private int weight;
- int age;
- protected int height;
- public String name;

이 예제에서 Person 클래스의 private 필드의 weight는 Student 클래스에서는 접근이 불가능하여 슈퍼 클래스인 Person의 get, set 메서드를 통해서만 조작이 가능하다.

### SOLID 원칙 접목
- 다수는 아니지만 보편적 공통점을 찾아 상위 클래스를 구성함 -> SRP 만족
- Person 클래스에 Student 외 Teacher로도  확장될 수 있음 -> OCP 만족
- Person의 getter/setter은 weight에 접근하기 위한 메서드일뿐, Person의 역할을 받진 않음 LSP 무관
- ISP 무관
- DIP 무관