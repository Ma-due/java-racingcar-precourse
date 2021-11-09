package racingcar.domain;

import racingcar.car.Cars;
import racingcar.view.InputView;

import java.util.List;

public class GameController {
    private final InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void play() {
        Cars cars = new Cars(inputView.inputCarNameLine());

        int gameStepCount = inputView.inputGameStepCount();
    }
}
