enum bankAccountType{
    SAVINGS,
    CUURENT;
}

public class Account extends Bank{

     String name;

     int account_Balance;


    public Account(String name, int account_Balance,  bankAccountType b,String bankName) {
        this.name = name;
        this.account_Balance = account_Balance;
        this.bankName=bankName;

    }
}
