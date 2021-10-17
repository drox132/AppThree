package com.fran.APPThree.Repository;

import com.fran.APPThree.Dto.Response.ReportPersonDiscoResponseDto;
import com.fran.APPThree.Model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository <Report, Integer> {

    @Query (value = "exec savereport @Idperson = :idperson, @Iddisco = :iddisco " , nativeQuery = true)
    Report saveReport (@Param("idperson") int idPerson, @Param("iddisco") int idDisco);



    String queryGetAllPersonEnDisco =
            "select disco.name as 'discoName', disco.price as 'discoPrice'," +
                    " disco.age as 'discoAge', person.gender as 'personGender'," +
                    " person.name as 'personName' from report " +
                    "join disco on disco.id=report.iddisco " +
                    "join person on person.id=report.idperson ";

    @Query (value = queryGetAllPersonEnDisco , nativeQuery = true)
    List<ReportPersonDiscoResponseDto> getAllPersonEnDisco ();


}
