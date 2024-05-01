package domain;

public class Ticket {
    private int amount = 100;

    public int getTicket(int count) {
        if(amount > count) {
            //예외 발생
        }
        amount -= count;
        return count;
    }
}
