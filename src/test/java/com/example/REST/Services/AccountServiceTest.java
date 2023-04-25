package com.example.REST.Services;

import com.example.REST.domains.Account;
import com.example.REST.repositories.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountServiceTest {
    @MockBean
    AccountRepository accountRepository;

    @Autowired
    private AccountService accountService;

    @TestConfiguration
    static class AccountServiceTEstContextConfig {
        @Bean
        public AccountService accountService() {
            return new AccountService();
        }
    }

    @Before
    public void setUp() {
        String accountNumber = "123L";
        Account bazen = new Account("Bazen", "bazen@gmail.com", accountNumber, 1232.3);
        accountRepository.save(bazen);
        Optional<Account> bopt = Optional.of(bazen);
        Mockito.when(accountRepository.findByAccountNumber(accountNumber)).thenReturn(bazen);

    }

    @Test
    public void findValidCustomer() {
        //String accountNumber = "123L";
        List<Account> found = accountService.getAcountList();
        assertThat(found.size(), equalTo(1));
    }



}
