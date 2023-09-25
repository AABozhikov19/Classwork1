public class Dice {
    private String id;

    private double balance;

    public Dice(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void idBalance(){
        System.out.println(id+" "+balance);
    }
}
