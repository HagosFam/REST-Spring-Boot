package com.example.REST.Services;

import com.example.REST.domains.Account;
import com.example.REST.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAcountList() {
        return this.accountRepository.findAll();
    }

    public void postAccount(Account account) {
        this.accountRepository.save(account);
    }

}
