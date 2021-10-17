package com.fran.APPThree.Helper;

import com.fran.APPThree.Dto.Request.VerifyDateRequestDto;
import com.fran.APPThree.Model.Disco;
import com.fran.APPThree.Model.Person;
import com.fran.APPThree.Model.Report;
import com.fran.APPThree.Service.DiscoService;
import com.fran.APPThree.Service.PersonService;
import com.fran.APPThree.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompleteProcess {

    private final static String NO_PASA = "NO PASA";
    private final static String PASA = "PASA";


    private final PersonService personService;
    private final DiscoService discoService;
    private final ReportService reportService;

    @Autowired
    public CompleteProcess(PersonService personService, DiscoService discoService, ReportService reportService) {
        this.personService = personService;
        this.discoService = discoService;
        this.reportService = reportService;
    }

    public String verifyData(VerifyDateRequestDto verifyDateRequestDto) {

        Disco discoSelected = discoService.selectDiscoById(verifyDateRequestDto.getIdDisco());
        Person person=new Person(
                verifyDateRequestDto.getAge(),
                verifyDateRequestDto.getMoney(),
                verifyDateRequestDto.getGender(),
                verifyDateRequestDto.getName());


        if(discoSelected.getId()==3 ) {
            if(verifyDateRequestDto.getAge() <21 || verifyDateRequestDto.getMoney()<300) {
                return NO_PASA;
            }

        }

        if(discoSelected.getId()==2 ) {
            if(verifyDateRequestDto.getAge()<18 || verifyDateRequestDto.getMoney()<200 || !verifyDateRequestDto.getGender().equals("female") ) {
                return NO_PASA;
            }

        }

        if(discoSelected.getId()==1 ) {
            if(verifyDateRequestDto.getAge()<17 || verifyDateRequestDto.getMoney()<100 ||!verifyDateRequestDto.getGender().equals("male")) {
                return NO_PASA;
            }

        }

        Person afterBd = personService.SavePerson(person);

        Report report= new Report(verifyDateRequestDto.getIdDisco(),afterBd.getId());

        reportService.saveReport(report);

        return PASA;
    }


/**
 *
 SELECT disco.name as 'nombre de disco', disco.price as 'precio de entrada', disco.gender,disco.age 'edad minima', person.name, person.money  FROM report
 JOIN disco
 ON disco.id = iddisco
 JOIN person
 ON person.id = idperson

 */


}
