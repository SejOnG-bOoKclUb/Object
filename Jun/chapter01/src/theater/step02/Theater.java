package theater.step02;

import theater.step02.Audience;
import theater.step02.Ticket;
import theater.step02.TicketSeller;

/**
 * Theater : 소극장
 * 관람객을 맞이할 수 있어야 한다.
 */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}