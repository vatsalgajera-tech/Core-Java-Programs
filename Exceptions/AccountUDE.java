class NotAllowedException extends Exception{
    NotAllowedException(String msg){
        super(msg);
    }
}
class ShortLenghtException extends Exception{
    ShortLenghtException(String msg){
        super(msg);
    }
}
public class AccountUDE {
    int balance;
    String customerName;

    AccountUDE(int balance,String customername) throws ShortLenghtException{
        if (customername.length()<10) {
            throw new ShortLenghtException("Name at least 10 charecters");
        }
        this.balance = balance;
        this.customerName = customername;
    }
    
    void Withdraw(int amt) throws NotAllowedException{
        if ((balance - amt) < 5000){
            throw new NotAllowedException("Insufficient balance");
        }
        balance -= amt;
        System.out.println("Remaining Balance :- " + balance);
    }
    
    public static void main(String[] args) {
        try {
            AccountUDE ac = new AccountUDE(10000,"yashbaraiiii");
            ac.Withdraw(2000);
            ac.Withdraw(3000);

        } catch (ShortLenghtException | NotAllowedException e) {
            System.out.println(e.getMessage());
        }
    }   
}