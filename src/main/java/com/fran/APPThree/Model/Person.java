package com.fran.APPThree.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name= "person")
public class Person {

    @Id
    private int id;
    private int age;
    private int money;
    private String gender;
    private String name;


    public Person(int id, int age, int money, String gender, String name) {
        this.id = id;
        this.age = age;
        this.money = money;
        this.gender = gender;
        this.name = name;
    }

    public Person(int age, int money, String gender, String name) {
        this.age = age;
        this.money = money;
        this.gender = gender;
        this.name = name;
    }
}
