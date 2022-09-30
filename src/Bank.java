/*Implement a banking system using java.

Create 3 sub class of Bank : SBI,BOI,ICICI

All 4 should have following methods:

    getDetails which provide their specific details like rateofinterest etc
    printDetails of every bank.
    Every bank account should have a type (enum): SAVINGS, CURRENT
    Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is
    less than the current balance.
    Every banking transaction should be saved in a file of each bank's transaction log which would have all details o
    f the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after
    deduction,transaction status (can also be enum), failure reason if any)
*/

public class Bank {
    private int numberOfCustomers;
    private int numberOfBranches;

    private String name;
    private String bankName;
    private int accountBalance;
    private int rateOfInterest;

    private enum accountType{ SAVINGS,CURRENT};



    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public  void getDetails(){
            //send rateOfInterest
    };
    // this will print the above details
       void printDetails(){


    };

    //common functionality
     void debit_amount(Bank account){

            account.setAccountBalance(account.accountBalance--);
     };


     public static  void main(String[] args){

     }
}
