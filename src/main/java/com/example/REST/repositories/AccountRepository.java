package com.example.REST.repositories;
import com.example.REST.domains.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {
//    Account findByPhone(String phone);
//    Account findByEmail(String email);
//    List<Account> findByCreditCardType(String type);
//    @Query("{email : :#{#email}}")
//    Account findCustomerWithEmail(@Param("email") String email);
    Account findByAccountHolderName(String accountHolderName);

    Account findByAccountNumber(String accountNumber);

}
