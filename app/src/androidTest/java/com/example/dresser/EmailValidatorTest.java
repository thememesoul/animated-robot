package com.example.dresser;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {

    @Test
    public void emailValidation_CorrectEmailSimple_ReturnTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"));
    }

    @Test
    public void emailValidation_CorrectEmailSubdomain_ReturnTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com.uk"));
    }

    @Test
    public void emailValidation_InvalidEmailNotId_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"));
    }

    @Test
    public void emailValidation_InvalidEmailDoubleDot_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidation_InvalidEmailNoUserName_ReturnTrue() {
        assertFalse(EmailValidator.isValidEmail("@email.com"));
    }
}

