package theater.step03;

import theater.step03.Audience;
import theater.step03.TicketOffice;

/**
 * TicketSeller : 판매원
 * 판매원은 매표소에서 초대장을 티켓으로 교환해 주거나 티켓을 판매하는 역할을 수행한다.
 * 판매원은 구현한 TicketSeller 클래스는 자신이 일하는 매표소를 알고 있어야 한다.
 * */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
