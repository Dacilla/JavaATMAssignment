package com.mycompany.atmimplementation;

public class FixedAccount extends Account{

    private Boolean earlyWithdrawal;
    
    @Override
    public Double calculateInterest() {
        return null;
    }

    public Boolean getEarlyWithdrawal() {
        return earlyWithdrawal;
    }

    public void setEarlyWithdrawal(Boolean earlyWithdrawal) {
        this.earlyWithdrawal = earlyWithdrawal;
    }
    
    
}
