package theater.domain;

public class TicketSeller{
    private Audience audience;
    private Amount amount;

    public TicketSeller(Audience audience, Amount amount) {
        this.audience = audience;
        this.amount = amount;
    }

    public Screening sell(String name){
        Amount payAmount = audience.pay(ticket);
        amount.addAmount(payAmount);
    }

    public Screening changeTicket(Title title) {

    }
}
