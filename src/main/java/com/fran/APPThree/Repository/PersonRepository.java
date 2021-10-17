package com.fran.APPThree.Repository;

import com.fran.APPThree.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {

    /*
CREATE PROCEDURE saveperson @Age int, @Gender varchar(100), @Money int, @Name varchar(50)
            AS
    insert into person (age , gender, money, name) values (@Age, @Gender, @Money, @Name);
    SELECT top 1 * FROM person order by id desc;
    GO;*/

    @Query (value= "exec saveperson @Age = :ageusuario , @Gender = :genderusuario , @Money = :moneyusuario , @Name = :nameusuario", nativeQuery = true)
    Person savePerson (@Param("ageusuario") int age, @Param("genderusuario") String gender, @Param("moneyusuario") int money, @Param("nameusuario") String name);

}
