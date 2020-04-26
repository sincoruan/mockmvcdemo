package com.example.mockmvctest.domain;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

@Data
public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }
}
