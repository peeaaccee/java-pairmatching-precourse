package pairmatching;

import static pairmatching.InputView.selectOption;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        PairController controller = new PairController();
        Option input = null;
        while (input != Option.QUIT) {
            input = selectOption();
            if (input == Option.MATCH_PAIR) {
                controller.selectMatchPair();
                continue;
            }
            if (input == Option.SELECT_PAIR) {
                controller.selectPair();
                continue;
            }
            if (input == Option.INITIAL_PAIR) {
                controller.initialPair();
            }
        }
    }
}
