package com.example.springboot_junit5_mockito.controller;

import com.example.springboot_junit5_mockito.service.impl.TestServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SpringbootJunit5MockitoApplicationControllerTests {

    @Mock
    TestServiceImpl testService;
    @InjectMocks
    TestController testController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        testController = new TestController(testService);
    }

    @Test
    void testControllerClass() {

        String expectedResponse = "This is my Universe!!";
        when(testService.getTestService()).thenReturn(expectedResponse);
        ResponseEntity<String> responseEntity = testController.getService();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResponse, responseEntity.getBody());

    }
}

