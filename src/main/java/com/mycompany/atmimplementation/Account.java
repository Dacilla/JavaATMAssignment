package com.mycompany.atmimplementation;

public abstract class Account {
    private String accountNumber;
    private Double balance;
    protected Long withdrawalLimit;
    private Double totalWithdrawnPerDay;
    private Double interestRate;
    private Double interestEarned;
    
    public Double calculateInterest(){
        return null;
    }
    
    public Boolean checkNotes(){
        return true;
    }
    
    public Boolean hasEnoughFunds(Double amount){
        return true;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Long withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public Double getTotalWithdrawnPerDay() {
        return totalWithdrawnPerDay;
    }

    public void setTotalWithdrawnPerDay(Double totalWithdrawnPerDay) {
        this.totalWithdrawnPerDay = totalWithdrawnPerDay;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(Double interestEarned) {
        this.interestEarned = interestEarned;
    }
    
    
}
