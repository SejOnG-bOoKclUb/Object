package theater.domain;

public class Amount {

    private int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    public void addAmount(Amount amount){
        this.amount += AmountToInteger(amount);
    }


    private int AmountToInteger(Amount amount){
        return Integer.parseInt(String.valueOf(amount));
    }



}
