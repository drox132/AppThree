package com.fran.APPThree.Service;

import com.fran.APPThree.Dto.Request.VerifyDateRequestDto;
import com.fran.APPThree.Model.Person;

public interface PersonService {

    Person SavePerson (Person person);

    String verifyData (VerifyDateRequestDto verifyDateRequestDto);

}
