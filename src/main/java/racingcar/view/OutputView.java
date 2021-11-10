package racingcar.view;

import java.util.List;

public class OutputView {

    public static void printGameMessage() {
        System.out.println("실행 결과");
    }

    public static void printGameStep(List<String[]> GameResult) {
        for (String[] strings : GameResult) {
            System.out.println(strings[0] + " : " + strings[1]);
        }
        System.out.println();
    }

    public static void printGameWinner(List<String> winner) {
        System.out.print("최종 우승자: ");
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i));
            if (i != winner.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
