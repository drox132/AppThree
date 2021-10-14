package com.fran.APPThree.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Person() {
    }

    public Person(int id, int age, int money, String gender) {
        this.id = id;
        this.age = age;
        this.money = money;
        this.gender = gender;
    }

    public Person(int age, int money, String gender) {
        this.age = age;
        this.money = money;
        this.gender = gender;
    }
}
