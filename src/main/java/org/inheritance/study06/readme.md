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

<br>
<br>
출처: Java 명품 Programming (p.315)
<br>
<br>
</span>

