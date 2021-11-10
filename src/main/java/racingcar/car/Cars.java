package racingcar.car;

import utils.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
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
        String hyphen = intToHyphen(position);

        return new String[]{name, hyphen};
    }

    public List<String> getWinnerList() {
        return cars.stream()
                .filter(Car::isWinner)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private boolean canGo() {
        return RandomUtils.nextInt(0, 9) >= 4;
    }

    private String intToHyphen(int count) {
        StringBuilder hyphen = new StringBuilder();
        for (int i = 0; i < count; i++) {
            hyphen.append("-");
        }

        return hyphen.toString();
    }
}
