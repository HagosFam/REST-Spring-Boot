package com.example.REST.dtos;

import com.example.REST.domain.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountAdapter {
    public Account getAccountFromAccountDTO(AccountDTO accountDTO) {
        Account account = new Account();
        account.setAccountHolder(accountDTO.getAccountHolder());
        account.setAccountHolderEmail(accountDTO.getAccountHolderEmail());
        account.setAccountHolderName(account.getAccountHolderName());
        account.setAccountNumber(accountDTO.getGetAccountNumber());
        account.setCreditCard(account.getCreditCard());
        return account;
    }


    public AccountDTO getAccountDTOFromAccount(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountHolder(account.getAccountHolder());
        accountDTO.setAccountNumber(account.getGetAccountNumber());
        accountDTO.setAccountHolderEmail(account.getAccountHolderEmail());
        accountDTO.setAmount(account.getAmount());
        accountDTO.setAccountHolderName(account.getAccountHolderName());
        return accountDTO;
    }

    public List<AccountDTO> getAccountDTOListFromAccountList(List<Account> accounts) {
        List<AccountDTO> accountDTOS = new ArrayList<>();
        for (Account account:accounts) {
            accountDTOS.add(getAccountDTOFromAccount(account));
        }
        return accountDTOS;
    }

}
