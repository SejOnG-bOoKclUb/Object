package theater.domain;

public class Bag {

    private Amount amount;
    private Ticket ticket;

    public Bag(Amount amount, Ticket ticket) {
        this.amount = amount;
        this.ticket = ticket;
    }

    public Bag(Amount amount) {
        this.amount = amount;
        this.ticket = null;
    }

    public void check(screening screening) {
        if(ticket.check(screening)){
            return ticketSeller.changeTicket(screening);
        }
        return ticketSeller.sell(screening);

    }
}
