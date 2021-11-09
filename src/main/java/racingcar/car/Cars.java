package racingcar.car;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> carNameList) {
        this.cars = carNameList.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
