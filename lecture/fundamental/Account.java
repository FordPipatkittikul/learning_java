package fundamental;

public class Account {
    // attributes
    private String owner;
    private double balance;
    private double minimumBalance;

    // method that doesn't return value
    public void deposit(double amount) {
        // need to implement
    }

    // method that doesn't return value
    public void withdraw(double amount){
        // need to implement
    }

    public double calculateCreditWorthiness(){
        // need to implement
        return 100;
    }

    // getter
    public String getOwner() {
        return owner;
    }

    // setter
    public void setOwner(String owner) {
        this.owner = owner;
    }

}
