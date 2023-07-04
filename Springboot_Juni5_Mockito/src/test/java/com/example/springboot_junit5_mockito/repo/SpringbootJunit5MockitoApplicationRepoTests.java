package com.example.springboot_junit5_mockito.repo;

import com.example.springboot_junit5_mockito.repository.TestRepository;
import com.example.springboot_junit5_mockito.service.impl.TestServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SpringbootJunit5MockitoApplicationRepoTests {
    @Mock
    TestServiceImpl testService;
    @Mock
    TestRepository testRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        testService = new TestServiceImpl(testRepository);
    }

    @Test
    void testRepository() {
        String result = testRepository.getTestServiceRepo();
        String expectedResponse = "This is my Universe!!";
        when(testRepository.getTestServiceRepo()).thenReturn(expectedResponse);
        assertEquals(expectedResponse, result);
    }

}
