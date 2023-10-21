package baseball;

public class OutputHandler {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printGameStart() {
        printMessage("숫자 야구 게임을 시작합니다.");
    }

    public static void printGameEnd() {
        printMessage("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printGameRestart() {
        printMessage("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printHint(Judgement judgement) {
        String message = joinHintMessage(judgement);
        printMessage(message);
    }

    private static String joinHintMessage(Judgement judgement) {
        StringBuilder sb = new StringBuilder();

        if (judgement.balls > 0) {
            sb.append(judgement.balls).append("볼");
        }
        if (judgement.strikes > 0) {
            if (judgement.balls > 0) {
                sb.append(" ");
            }
            sb.append(judgement.strikes).append("스트라이크");
        }

        return sb.isEmpty() ? "낫싱" : sb.toString();
    }
}
