package com.example.REST.Repositories;
import com.example.REST.domains.Account;
import com.example.REST.repositories.AccountRepository;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


@DataJpaTest
@RunWith(SpringRunner.class)
public class AccountRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testFindByAccountHolderName() {
        // Create test data
        Account account1 = new Account("Bazen", "bazen@gmail.com", "1231L", 1232.3);
        Account account2 = new Account("Mussie", "bazen@gmail.com", "1231L", 1232.3);
        Account account3 = new Account("Abbas", "bazen@gmail.com", "1231L", 1232.3);

        // Insert test data into the database
        testEntityManager.persist(account1);
     //   testEntityManager.flush();
       // testEntityManager.persist(account2);
       // testEntityManager.persist(account3);

        // Test the method
        Account foundAccount = accountRepository.findByAccountHolderName("Bazen");

        // Check the result
      //  Assertions.assertNotNull(foundAccount);
      //  Assertions.assertEquals(1L, foundAccount.getId());
        Assertions.assertEquals("Bazen", foundAccount.getAccountHolderName());
       // Assertions.assertEquals(100.0, foundAccount.getBalance(), 0.0001);
    }

}
