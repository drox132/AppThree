package com.fran.APPThree.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name= "report")
public class Report {

    @Id
    private int id;
    @Column (name = "iddisco")
    private int idDisco;
    @Column(name= "idperson")
    private int idPerson;

    public Report(int idDisco, int idPerson) {
        this.idDisco = idDisco;
        this.idPerson = idPerson;
    }

    public Report(int id, int idDisco, int idPerson) {
        this.id = id;
        this.idDisco = idDisco;
        this.idPerson = idPerson;
    }
}
