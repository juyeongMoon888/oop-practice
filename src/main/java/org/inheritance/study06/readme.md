## study06

상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하라. 
```java
class SharpPencil { //샤프 펜슬
    private int width; //펜의 굵기
    private int amount; // 남은 량

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amoun = amount;
    }
}
class BallPen { //볼펜
    private int amount; // 남은 량
    private String color; // 볼펜의 색

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amoun = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class FountainPen { //만년필
    private int amount; // 남은 량
    private String color; // 만년필의 색

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount; 
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void refill(int n) {
        amount = n; //남은 량 보충
    }
}
```

***
<span style="color:lightGray">

SOLID 원칙 적용
<br>- SRP: Pen 종류 별로 공통점을 'Pen'이라는 슈퍼 클래스로 두었으니 만족 ✅
<br>- OCP: Pen 클래스에 형광펜 클래스가 추가된다고 한들 Pen의 코드는 수정될 필요 없으니 만족 ✅
<br>- LSP: 펜들이 슈퍼 클래스 Pen 역할을 모두 하고 있으니 만족 ✅
<br>- ISP: ⛔️ FountainPen은 width 값을 갖지 않는데 setWidth()에 접근이 되다보니 적합한 인터페이스만을 제공하는것 같지 않아서 위반된다고 생각함.
<br>- DIP: Pen은 자주 변경되는 대상이 아니므로 만족 ✅
<br>
출처: Java 명품 Programming (p.315)
<br>
<br>
</span>

