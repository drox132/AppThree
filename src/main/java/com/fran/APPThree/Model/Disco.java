package com.fran.APPThree.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Disco")
@Getter
@Setter
@NoArgsConstructor
public class Disco {
    @Id
    int id;
    String name;
    int price;
    String gender;
    int age;

    public Disco(int id, String name, int price, String gender, int age) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gender = gender;
        this.age = age;

    }
}
