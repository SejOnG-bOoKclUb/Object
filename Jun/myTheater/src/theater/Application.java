package theater;

import theater.controller.TheaterController;
import theater.view.InputView;
import theater.view.OutputView;

public class Application {
    public static void main(String[] args){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        TheaterController theaterController = new TheaterController(inputView, outputView);

    }
}
