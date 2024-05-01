package theater.domain;

public class Audience {

    private Bag bag;
    public Screening pay(Screening screening) {
        return bag.check(screening);
    }
}
