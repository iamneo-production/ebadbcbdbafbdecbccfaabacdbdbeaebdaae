package model;

public class AccountDetails{
	private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;
    
    public AccountDetails(String accountType,double wtd,double availableBalance,int pin){
        this.accountType=accountType;
        this.withdrawOrDepositAmount=wtd;
        this.availableBalance=availableBalance;
        this.pin=pin;

    }

    public String getAccountType() {
        return this.accountType;
    }
    public double getWithdrawOrDepositAmount() {
        return this.withdrawOrDepositAmount;
    }
    public double getAvailableBalance() {
        return this.availableBalance;
    }
    public int getPin() {
        return this.pin;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    public void setWithdrawOrDepositAmount(double withdrawOrDepositAmount) {
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
    }

}
