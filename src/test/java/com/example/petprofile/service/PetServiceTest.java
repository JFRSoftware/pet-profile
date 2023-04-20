package com.example.petprofile.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PetServiceTest {

    @Autowired
    private PetService petService;

    @Test
    void test1() {
        String value = petService.test();
        assertEquals("Hello quality.", value);
    }
}