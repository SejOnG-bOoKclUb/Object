package theater.step02;

import theater.step02.Invitation;
import theater.step02.Ticket;

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

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }


    public Bag(long amount){
        this.amount = amount;
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

}
