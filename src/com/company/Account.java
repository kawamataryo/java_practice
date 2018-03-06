package com.company;


/**
 * 口座種別
 */
enum AccountType {
  FUTSU, TOUZA, TEIKI
}

/**
 * 口座クラスです。
 */
public class Account {
  private int accountNo;
  private int balance;
  private AccountType accountType;

  Account(int aNo, AccountType aType) {
    accountNo = aNo;
    accountType = aType;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(int accountNo) {
    this.accountNo = accountNo;
  }
}
