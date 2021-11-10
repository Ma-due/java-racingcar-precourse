package racingcar.view;

import racingcar.valid.Validator;

import java.util.*;
import java.util.stream.Collectors;

import static racingcar.valid.Validator.*;

public class InputView {
    private static final String INPUT_CARS_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TOKENIZER_DELIM = ",";
    private static final String INPUT_GAME_COUNT_MESSAGE = "시도 횟수를 입력해 주세요 : ";

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> inputCarName() {
        List<String> carNameList = new ArrayList<>();

        System.out.println(INPUT_CARS_NAME_MESSAGE);
        String carNameString = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(carNameString, TOKENIZER_DELIM);

        while (stringTokenizer.hasMoreTokens()) {
            carNameList.add(stringTokenizer.nextToken());
        }

        return carNameList.
                stream()
                .filter(Validator::validationInputName)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public String inputGameStepCount() {
        System.out.println(INPUT_GAME_COUNT_MESSAGE);
        String gameStepCount = scanner.nextLine();
        System.out.println();

        if (!validationGameStepCount(gameStepCount)) {
            gameStepCount = inputGameStepCount();
        }

        return gameStepCount;
    }
}
