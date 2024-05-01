package theater.step03;

import theater.step03.Invitation;
import theater.step03.Ticket;

/**
 * 관람객이 가지고 올 수 있는 소지품은 3가지 뿐이다.
 * 1. 초대장
 * 2. 현금
 * 3. 티켓
 */
public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    private boolean hasInvitation(){
        return invitation != null;
    }

    private void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }


    public Bag(long amount){
        this.amount = amount;
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
