package racingcar.domain;

import racingcar.car.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;


public class GameController {
    private final InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void play() {
        Cars cars = new Cars(inputView.inputCarNameLine());

        int gameStepCount = Integer.parseInt(inputView.inputGameStepCount());

        OutputView.printGameMessage();
        while (gameStepCount > 0) {
            List<String[]> func = cars.func();
            OutputView.printGameStep(func);
            gameStepCount--;
        }

        List<String> winnerList = cars.getWinnerList();
        OutputView.printGameWinner(winnerList);
    }
}
