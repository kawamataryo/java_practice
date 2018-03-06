package com.company;

import static com.company.AccountType.FUTSU;
import static com.company.AccountType.TEIKI;
import static com.company.AccountType.TOUZA;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Account hogeAccount = new Account(123, FUTSU);
    Account fugaAccount = new Account(456, TOUZA);
    Account fooAccount = new Account(789, TEIKI);

  }
}
