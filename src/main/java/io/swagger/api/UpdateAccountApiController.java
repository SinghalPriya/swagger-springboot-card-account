package io.swagger.api;

import io.swagger.model.AccountDetails;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-02T10:00:02.459+05:30")

@Controller
public class UpdateAccountApiController implements UpdateAccountApi {

    public ResponseEntity<Void> updateAccountDetails(@ApiParam(value = "The account to be updated."  ) @RequestBody AccountDetails accountDetails) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
