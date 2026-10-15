package com.example.test.experiments;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.experiments.models.Test;

public interface Repository extends JpaRepository<Test,Integer>{
    
}


