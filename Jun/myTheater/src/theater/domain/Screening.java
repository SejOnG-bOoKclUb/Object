package theater.domain;

import java.time.LocalDateTime;

public class Screening {

    private Title title;
    private int runningTime;

    private int price;

    private TicketSeller ticketSeller;

    public Screening(String name, int runningTime) {
        this.name = name;
        this.runningTime = runningTime;
    }

    public Screening buy(String name){
        ticketSeller.sell(name);
    }

    public String playTitle(){
        return name;
    }
}
