package com.fran.APPThree.Repository;

import com.fran.APPThree.Model.Disco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscoRepository extends JpaRepository <Disco, Integer> {

    @Query (value= "select * from disco where id= :iduser ")
    Disco selectDiscoById(@Param("iduser") int id);


}
