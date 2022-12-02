package com.example.money;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Wallet {
    @Autowired
    List<Money> allMoney;

    public void showBalance() {
        for (Money money: allMoney) {
            System.out.println(money.getCurrency().getCurrencyName() + " : " + money.getCount());
        }
    }
}
