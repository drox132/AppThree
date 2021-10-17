package com.fran.APPThree.Service;

import com.fran.APPThree.Dto.Response.ReportPersonDiscoResponseDto;
import com.fran.APPThree.Model.Report;

import java.util.List;

public interface ReportService {

    Report saveReport (Report report);

    List<ReportPersonDiscoResponseDto> getAllPersonEnDisco ();


}
