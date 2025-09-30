# 상속 (Inheritance)

## 1. 기본 개념
- `ElectricCar`와 `GasCar`에는 **`move()` 메서드가 없음**에도 불구하고 호출이 가능합니다.
- 그 이유는 두 클래스가 `Car`를 **`extends`(상속)** 하고 있기 때문입니다.
- 상속을 받으면 자식 클래스에 메서드가 없어도, 부모 클래스에 정의된 메서드를 사용할 수 있습니다.

```java
public class Car {
    public void move() {
        System.out.println("차가 이동합니다.");
    }
}

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("전기를 충전합니다.");
    }
}

public class GasCar extends Car {
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}

ElectricCar electricCar = new ElectricCar();
electricCar.move();   // 부모(Car)의 move() 사용
electricCar.charge(); // 자식(ElectricCar)의 메서드

GasCar gasCar = new GasCar();
gasCar.move();   // 부모(Car)의 move() 사용
gasCar.fillUp(); // 자식(GasCar)의 메서드
```
## 2. 다중 상속 문제

만약 **하늘을 나는 자동차**를 만든다고 가정해 보겠습니다.

```java
public class Airplane {
    public void move() {
        System.out.println("하늘을 납니다.");
    }
}

public class Car {
    public void move() {
        System.out.println("땅에서 이동합니다.");
    }
}

// (가정) 다중 상속 시도
public class AirplaneCar extends Airplane, Car {
    // 어떤 move()를 써야 할까요?
}

```
Airplane.move()와 Car.move()가 동시에 존재한다면
AirplaneCar 입장에서는 어떤 move()를 호출해야 하는지 모호합니다.

이런 충돌 문제 때문에 자바는 다중 상속을 허용하지 않습니다.

## 3. 정리
- **단일 상속**  
  자식 클래스는 부모 클래스의 필드와 메서드를 물려받을 수 있다.

- **다중 상속 불가**  
  메서드 충돌 문제 때문에 자바에서는 허용하지 않는다.

- **인터페이스**  
  다중 상속의 대안으로, 여러 인터페이스를 구현하여 다중 기능 확장이 가능하다.  