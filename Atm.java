import java.util.Scanner;

public class Atm {
    private Account userAccount;
    private Scanner scanner;

    public Atm(Account account){
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("ATM menu:");
        System.out.println("1. Withdrow");
        System.out.println("2. Deposit");
        System.out.println("3. check balance");
        System.out.println("4. Exist");
    }
    public void processOption(int option){
        switch (option) {
            case 1:
              handleWithdrowal();
                break;
                case 2:
              handleDeposit();
                break;
                case 3:
              checkBalance();
                break;
                case 4:
             System.out.println("thankyou for using the ATM. GoodBye");
               System.out.println(0);
               default:
               System.out.println("Invalid option");
               
        }
    }
    private void handleWithdrowal(){
        System.out.println("Enter withdrow amount:");
         double amount = scanner.nextDouble();

         if (amount>0) {
            if (userAccount.withdrow(amount)) {
                System.out.println("withdrow successful");
                
            }else{
                System.out.println("Invalid amount");
            }

            
         }
    }
    private void handleDeposit(){
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        if (amount>0) {
            userAccount.deposit(amount);
                System.out.println("deposit successful");
                
            }else{
                System.out.println("Invalid amount");
            }
    }
    private void checkBalance(){
        System.out.println("current balance:" + userAccount.getBalance());
    }

    
}
