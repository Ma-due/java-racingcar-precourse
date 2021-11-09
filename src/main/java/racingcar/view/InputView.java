package racingcar.view;

import java.util.*;

import static racingcar.valid.Validator.*;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> inputCarNameLine() {
        List<String> carNameList = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String string = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");

        while (stringTokenizer.hasMoreTokens()) {
            String carName = stringTokenizer.nextToken();
            if(validationInputName(carName)) {
                carNameList.add(carName);
            }
        }

        return carNameList;
    }

    public int inputGameStepCount() {
        String gameStepCount = scanner.nextLine();

        if (validationGameStepCount(gameStepCount)) {
            inputGameStepCount();
        }

        return Integer.parseInt(gameStepCount);
    }
}
