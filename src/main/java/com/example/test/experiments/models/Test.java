package com.example.test.experiments.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test_table")
public class Test {
    public Test(String name) {

        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
}
