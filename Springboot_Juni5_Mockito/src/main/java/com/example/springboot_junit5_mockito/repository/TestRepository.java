package com.example.springboot_junit5_mockito.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public String getTestServiceRepo() {
            return "This is my Universe!!";
    }
}
