package com.example.springboot_junit5_mockito.controller;

import com.example.springboot_junit5_mockito.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    public final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/getService")
    public ResponseEntity<String> getService() {
        return new ResponseEntity<>(testService.getTestService(), HttpStatus.OK);
    }
}
