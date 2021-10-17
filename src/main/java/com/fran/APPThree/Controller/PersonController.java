package com.fran.APPThree.Controller;

import com.fran.APPThree.Dto.Request.VerifyDateRequestDto;
import com.fran.APPThree.Helper.CompleteProcess;
import com.fran.APPThree.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/person")
public class PersonController {

    private final PersonService personService;
    private final CompleteProcess completeProcess;

    @Autowired
    public PersonController(PersonService personService, CompleteProcess completeProcess) {
        this.personService = personService;
        this.completeProcess = completeProcess;
    }


    @PostMapping ("/verify")
    String verifyData (@RequestBody VerifyDateRequestDto verifyDateRequestDto ) {

        return completeProcess.verifyData(verifyDateRequestDto);

        //return personService.verifyData(verifyDateRequestDto);

    }

}

