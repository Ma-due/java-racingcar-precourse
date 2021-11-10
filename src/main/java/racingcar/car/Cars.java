package racingcar.car;

import utils.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private static final int RANDOM_MINIMUM_RANGE = 0;
    private static final int RANDOM_MAXIMUM_RANGE = 9;
    private static final int CAR_GO_CONDITION = 4;
    private static final String HYPHEN = "-";

    private final List<Car> cars;

    public Cars(List<String> carNameList) {
        this.cars = carNameList.stream()
                .map(Car::new)
                .collect(Collectors.toList());

        System.out.println(carNameList.toString());
    }

    public List<String[]> func() {
        cars.stream().filter(car -> canGo()).forEach(Car::go);
        return cars.stream()
                .map(car -> getData(car.getName(), car.getPosition()))
                .collect(Collectors.toList());
    }

    private String[] getData(String name, int position) {
        return new String[]{name, intToHyphen(position)};
    }

    public List<String> getWinnerList() {
        return cars.stream()
                .filter(Car::isWinner)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private boolean canGo() {
        return RandomUtils.nextInt(RANDOM_MINIMUM_RANGE, RANDOM_MAXIMUM_RANGE) >= CAR_GO_CONDITION;
    }

    private String intToHyphen(int count) {
        StringBuilder hyphen = new StringBuilder();
        for (int i = 0; i < count; i++) {
            hyphen.append(HYPHEN);
        }

        return hyphen.toString();
    }
}
