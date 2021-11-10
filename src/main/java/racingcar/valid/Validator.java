package racingcar.valid;

public class Validator {

    public static boolean validationInputName(String name) {
        return name.length() <= 5;
    }

    public static boolean validationGameStepCount(String gameStepCount) {
        try {
            Integer.parseInt(gameStepCount);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            return false;
        }
    }
}
