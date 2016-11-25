package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import io.swagger.model.AccountDetails;
import io.swagger.model.Accounts;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T18:09:28.587+05:30")

@RestController
public class AccountsApiController implements AccountsApi {

    //public static void main(String[] args)
    //{
       // SpringApplication.run(AccountsApiController.class, args);
   // }

    public ResponseEntity<Void> createAccount(@ApiParam(value = "The account to be created."  ) @RequestBody AccountDetails accountDetails) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AccountDetails> getAccountDetails(@ApiParam(value = "The person's accountNumber",required=true ) @PathVariable("accountNumber") Integer accountNumber) {
        // do some magic!
        return new ResponseEntity<AccountDetails>(HttpStatus.OK);
    }

    public ResponseEntity<Accounts> getAllAccounts() {
        System.out.println(" Getting here ******************************");
        AccountDetails accountDetails=new AccountDetails();
        accountDetails.setUserName("Maddy");
        accountDetails.setCustomerId(1234);


        Accounts accounts=new Accounts();
        accounts.add(accountDetails);


        return new ResponseEntity(accounts, HttpStatus.OK);
        //return new ResponseEntity<Accounts>(HttpStatus.OK);
    }

}
