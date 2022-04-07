package lab12;

public abstract class BankAccount {
    private double balance;
    private int numDeposits;
    private int numWithdrawals;
    private double interestRate;
    private double monthlyServiceCharge;


    public BankAccount(){

    }
    public BankAccount(double balance, double interestRate, double monthlyServiceCharge){
        this.balance = balance;
        this.interestRate = interestRate;
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    private void calcInterest() {
        
    }

    public void setMonthlyServiceCharge(){

    }

    public double getBalance(){
        return balance;
    }

    public int getNumDeposits(){
        return numDeposits;
    }

    public int getNumWithdrawals(){
        return numWithdrawals;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double getMonthlyServiceCharge(){
        return monthlyServiceCharge;
    }
}
