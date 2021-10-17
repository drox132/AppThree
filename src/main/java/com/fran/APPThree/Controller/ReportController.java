package com.fran.APPThree.Controller;

import com.fran.APPThree.Dto.Response.ReportPersonDiscoResponseDto;
import com.fran.APPThree.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/report")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping ("/getAllPersonEnDisco")
    public List<ReportPersonDiscoResponseDto> getAllPersonEnDisco (){

        return reportService.getAllPersonEnDisco();
    }


}
