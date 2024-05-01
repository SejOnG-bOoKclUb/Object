package theater.domain;

public class Ticket {

    private Title title;

    public Ticket(Title title) {
        this.title = title;
    }

    public boolean check(Screening screening) {
        if(title.isSame(screening)){
            return true;
        }
        return false;
    }
}
