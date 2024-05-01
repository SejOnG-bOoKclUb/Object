package theater.step02;

import theater.step02.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TicketOffice : 매표소
 * 매표소에서는 초대장을 티켓으로 교환하거나 구매해야 한다.
 * 매표소에서는 판매할 티켓과 티켓의 판매 금액이 보관돼 있어야 한다.
 */
public class TicketOffice {

    private List<Ticket> tickets = new ArrayList<>();
    private Long amount;

    public TicketOffice(Long amount, Ticket... tickets) {
        this.tickets.addAll(Arrays.asList(tickets));
        this.amount = amount;
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void minusAmonut(Long amount){
        this.amount -= amount;
    }

    public void plusAmonut(Long amonut){
        this.amount += amount;
    }
}
