package racingcar.domain;

import utils.RandomUtils;

public class Game {

    public Game() {
    }

    public boolean canGo() {
        return RandomUtils.nextInt(0, 9) >= 4;
    }
}
