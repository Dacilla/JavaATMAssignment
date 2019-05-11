package com.mycompany.atmimplementation;

public abstract class Account {
    private String accountNumber;
    private Double balance;
    private Long withdrawLimit;
    private Double totalWithdrawnPerDay;
    private Double interestRate;
    private Double interestEarned;
    
    public abstract Double calculateInterest();

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

    public Long getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Long withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
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
