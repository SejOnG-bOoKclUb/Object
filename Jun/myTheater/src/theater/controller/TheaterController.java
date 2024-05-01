package theater.controller;

import theater.view.InputView;
import theater.view.OutputView;

public class TheaterController {

    private InputView inputView;
    private OutputView outputView;
    public TheaterController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }


}
