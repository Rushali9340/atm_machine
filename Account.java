public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        balance+=amount;
    }

    public boolean withdrow(double amount){
        if (amount<=balance) {
            balance -=amount;
            return true;
            
        }else{
            System.out.println("Insufficint funds. withdrow failed");
       return false;
        }
    }

    

}
