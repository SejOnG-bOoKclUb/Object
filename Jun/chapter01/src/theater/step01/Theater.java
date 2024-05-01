package theater.step01;

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
        if(audience.getBag().hasInvitation()){ // 관람객이 초대장을 가지고 있다면?
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else{ // 관람객이 초대장을 가지고 있지 않다면?
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmonut(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}