package com.fran.APPThree.Controller;

import com.fran.APPThree.Service.DiscoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/disco")
public class DiscoController {

    private final DiscoService discoService;

    @Autowired
    public DiscoController(DiscoService discoService) {
        this.discoService = discoService;



    }
}
