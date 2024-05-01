package controller;

import view.InputView;

public class TheaterController {
    //view 에서 관객에 대한 정보가 넘어옴
    //해당 관객에 대한 처리를 판매자에게 넘김
    //판매자가 최종적으로 티켓을 반환하면
    //view 로 다시 넘김

    public static void enter() {
        int ticketCnt = InputView.enter();

    }
}
