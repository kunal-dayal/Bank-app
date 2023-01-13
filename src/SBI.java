import java.util.Objects;
import java.util.UUID;

public class SBI implements BankInterface{
    private String name;
    private String accountno;
    private double balance;
    private String password;
    private double rateofinterest;

    public SBI(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofinterest = 6.5;
        this.accountno = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkbalance() {
        return balance;
    }
    @Override
    public String addmonet(int amount) {
        balance = balance+amount;
        return "your balance : "+ balance;
    }

    @Override
    public String withdrawlmoney(int amt, String entpassword) {
        if(Objects.equals(entpassword,password)){
            if(balance>=amt){
                balance = balance-amt;
                return "money money :" + balance;
            }else{
                return "pesa kam he tere acc me bro";
            }
        }else{
            return "your password is incorect";
        }
    }

    @Override
    public double calculateinterest(int years) {
        return (balance*years*rateofinterest)/100;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(double rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
