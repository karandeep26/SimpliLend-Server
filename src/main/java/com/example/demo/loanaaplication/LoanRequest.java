package com.example.demo.loanaaplication;

import com.example.demo.Address;

/**
 * Created by karan on 27/5/17.
 */
public class LoanRequest {
    private Address address;
    private LoanApplication loanApplication;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
}
