package com.example.poctransfer.business.domain;

public class PersonAccountBO {
    private PersonBO person;
    private AccountBO account;

    public PersonAccountBO(PersonBO customer, AccountBO account) {
        this.person = customer;
        this.account = account;
    }

    public PersonBO getPerson() {
        return person;
    }

    public AccountBO getAccount() {
        return account;
    }
}
