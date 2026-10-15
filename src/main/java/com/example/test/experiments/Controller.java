package com.example.test.experiments;

import java.util.List;
import java.util.Map;

import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.experiments.models.Test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {
    private final Repository repository;

    Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/name")
    public Test addUser(@RequestBody @NonNull Map<Object, Object> entity) {
        if(entity.get("name")==null && (entity.get("id")==null)) return null;
        
        Test test = new Test((String) entity.get("name"));
        repository.save(test);

        return test;

    }

    @GetMapping("/name")
    public List<Test> getNames() {
        return repository.findAll();
    }

}
