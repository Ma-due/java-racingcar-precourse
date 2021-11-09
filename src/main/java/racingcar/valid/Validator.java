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
            System.out.println("숫자를 입력해주세용");
            return false;
        }
    }
}
