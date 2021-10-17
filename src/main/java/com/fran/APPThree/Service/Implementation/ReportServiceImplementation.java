package com.fran.APPThree.Service.Implementation;

import com.fran.APPThree.Dto.Response.ReportPersonDiscoResponseDto;
import com.fran.APPThree.Model.Report;
import com.fran.APPThree.Repository.ReportDtoRepository;
import com.fran.APPThree.Repository.ReportRepository;
import com.fran.APPThree.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImplementation implements ReportService {

    private final ReportRepository reportRepository;
    private final ReportDtoRepository reportDtoRepository;

    @Autowired
    public ReportServiceImplementation(ReportRepository reportRepository, ReportDtoRepository reportDtoRepository) {
        this.reportRepository = reportRepository;
        this.reportDtoRepository = reportDtoRepository;
    }

    @Override
    public Report saveReport(Report report) {

        return reportRepository.saveReport(report.getIdPerson(),report.getIdDisco());


    }

    @Override
    public List<ReportPersonDiscoResponseDto> getAllPersonEnDisco() {
        //return reportRepository.getAllPersonEnDisco();
        return reportDtoRepository.getAllPersonEnDisco();
    }
}
