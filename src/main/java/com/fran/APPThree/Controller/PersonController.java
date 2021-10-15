package com.fran.APPThree.Controller;

import com.fran.APPThree.Dto.Request.VerifyDateRequestDto;
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

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping ("/verify")
    String verifyData (@RequestBody VerifyDateRequestDto verifyDateRequestDto ) {

        return personService.verifyData(verifyDateRequestDto);

    }

}

