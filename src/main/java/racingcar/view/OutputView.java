package racingcar.view;

import java.util.List;
import java.util.SplittableRandom;

public class OutputView {
    private static final String PRINT_GAME_MESSAGE = "실행 결과";
    private static final String WINNER_MESSAGE = "최종 우승자: ";
    private static final String MULTI_WINNER_TEXT = ", ";
    private static final int NAME_INDEX = 0;
    private static final int HYPHEN_INDEX = 1;

    public static void printGameMessage() {
        System.out.println(PRINT_GAME_MESSAGE);
    }

    public static void printGameStep(List<String[]> GameResult) {
        for (String[] strings : GameResult) {
            System.out.println(strings[NAME_INDEX] + " : " + strings[HYPHEN_INDEX]);
        }
        System.out.println();
    }

    public static void printGameWinner(List<String> winner) {
        System.out.print(WINNER_MESSAGE);
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i));
            if (i != winner.size() - 1) {
                System.out.print(MULTI_WINNER_TEXT);
            }
        }
    }
}
