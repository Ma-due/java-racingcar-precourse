package racingcar.valid;

public class Validator {
    private static final String GAME_COUNT_ERROR_MESSAGE = "[ERROR] 시도 횟수는 숫자여야 한다.";
    private static final int NAME_LENGTH_CONDITION = 5;

    public static boolean validationInputName(String name) {
        return name.length() <= NAME_LENGTH_CONDITION;
    }

    public static boolean validationGameStepCount(String gameStepCount) {
        try {
            Integer.parseInt(gameStepCount);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(GAME_COUNT_ERROR_MESSAGE);
            return false;
        }
    }
}
