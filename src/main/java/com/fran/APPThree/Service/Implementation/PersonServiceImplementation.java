package com.fran.APPThree.Service.Implementation;

import com.fran.APPThree.Dto.Request.VerifyDateRequestDto;
import com.fran.APPThree.Model.Disco;
import com.fran.APPThree.Model.Person;
import com.fran.APPThree.Repository.PersonRepository;
import com.fran.APPThree.Service.DiscoService;
import com.fran.APPThree.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplementation implements PersonService {

    private final static String NO_PASA = "NO PASA";
    private final static String PASA = "PASA";

    private final DiscoService discoService;
    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImplementation(DiscoService discoService, PersonRepository personRepository) {
        this.discoService = discoService;
        this.personRepository = personRepository;
    }



    @Override
    public Person SavePerson(Person person) {
        return personRepository.savePerson(person.getAge(),person.getGender(),person.getMoney(), person.getName()) ;
    }

    @Override
    public String verifyData(VerifyDateRequestDto verifyDateRequestDto) {

        Disco discoSelected = discoService.selectDiscoById(verifyDateRequestDto.getIdDisco());

        if(discoSelected.getId()==3 ) {
            if(verifyDateRequestDto.getAge() <21 || verifyDateRequestDto.getMoney()<300) {
                return NO_PASA;
            }
            this.SavePerson(new Person(verifyDateRequestDto.getAge(),verifyDateRequestDto.getMoney(), verifyDateRequestDto.getGender(), verifyDateRequestDto.getName()));
            return PASA;
        }

        if(discoSelected.getId()==2 ) {
            if(verifyDateRequestDto.getAge()<18 || verifyDateRequestDto.getMoney()<200 || verifyDateRequestDto.getGender() != "female") {
                return NO_PASA;
            }
            this.SavePerson(new Person(verifyDateRequestDto.getAge(),verifyDateRequestDto.getMoney(), verifyDateRequestDto.getGender(), verifyDateRequestDto.getName()));

            return PASA;
        }

        if(discoSelected.getId()==1 ) {
            if(verifyDateRequestDto.getAge()<17 || verifyDateRequestDto.getMoney()<100 || verifyDateRequestDto.getGender() != "male") {
                return NO_PASA;
            }
            this.SavePerson(new Person(verifyDateRequestDto.getAge(),verifyDateRequestDto.getMoney(), verifyDateRequestDto.getGender(), verifyDateRequestDto.getName()));

            return PASA;
        }

        return null;
    }

}
