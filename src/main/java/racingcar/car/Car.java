package racingcar.car;

public class Car {
    private final String name;
    private int position = 0;
    private static int maxPosition = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void go() {
        this.position++;
        maxPosition = Math.max(maxPosition, this.position);
    }

    public boolean isWinner() {
        return maxPosition == this.position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
