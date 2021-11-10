package racingcar.view;

import java.util.List;

public class OutputView {
    private static final String PRINT_GAME_MESSAGE = "실행 결과";
    private static final String WINNER_MESSAGE = "최종 우승자: ";
    private static final String MULTI_WINNER_TEXT = ", ";
    private static final int NAME_INDEX = 0;
    private static final int HYPHEN_INDEX = 1;

    public static void printGameMessage() {
        System.out.println(PRINT_GAME_MESSAGE);
    }

    public static void printGameStep(List<String[]> carData) {
        for (String[] carInformation : carData) {
            System.out.println(carInformation[NAME_INDEX] + " : " + carInformation[HYPHEN_INDEX]);
        }
        System.out.println();
    }

    public static void printGameWinner(List<String> winner) {
        System.out.print(WINNER_MESSAGE + String.join(MULTI_WINNER_TEXT, winner));
    }
}
