package com.example.REST.controller;

import com.example.REST.Services.AccountService;
import com.example.REST.domain.Account;
import com.example.REST.domain.CreditCard;
import com.example.REST.domain.CustomErrorType;
import com.example.REST.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountConroller {

    @Autowired
    AccountService accountService;
    private Map<String, Account> accountMap = new HashMap<String, Account>();

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello";
    }

    @RequestMapping( "/greetingClass")
    public CreditCard greetingName() {
        return  new CreditCard("12321", "Checking", "20/28"); // returning a class
    }

// returning response entity
    @RequestMapping("/greetingResponseEntity/{message}")
   public ResponseEntity<?> getResponseEntity(@PathVariable("message") String message) {
        Greeting greeting = new Greeting("Hello");
        if(greeting.equals("Hello")) {
             greeting.setContent("Hello world from Tigray");
        }
        else {
            return new ResponseEntity(new CustomErrorType("Message" + message + "not available"), HttpStatus.NOT_FOUND  );
        }
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

   // @RequestMapping(value = "/del", method = RequestMethod.DELETE), this are the same, so use the short one, KISS
   //  @DeleteMapping("/del")

//    @RequestMapping(value = "/mod", method = RequestMethod.PUT)
//    @PutMapping(value = "/mod")
//    @PutMapping("/mod")


    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getContact() {
      List<Account> accounts = this.accountService.getAcountList();
      if(accounts.isEmpty()) {
          return new ResponseEntity(new CustomErrorType("No account found"), HttpStatus.NOT_FOUND  );
      }
      else {
        //  return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
          return ResponseEntity.ok(accounts);
      }
    }

    @PostMapping("/createAccount")
    public ResponseEntity<?> createAccount(@RequestBody Account account) {
       try {
           this.accountService.postAccount(account);
           return ResponseEntity.status(HttpStatus.CREATED).body(account);
       }
       catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }


    }









}
