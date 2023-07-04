package com.example.springboot_junit5_mockito.service.impl;

import com.example.springboot_junit5_mockito.repository.TestRepository;
import com.example.springboot_junit5_mockito.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @Override
    public String getTestService() {
        return testRepository.getTestServiceRepo();
    }
}
