package com.cseru;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Assignment1FunctionalJavaTest {
    Assignment1FunctionalJava afj;

    @BeforeEach
    void setUp() {
        afj = new Assignment1FunctionalJava();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void factorial0() {
        int factorialOf0 = afj.factorial(0);
        assertEquals(0,factorialOf0);
    }
    @Test
    void factorial1() {
        int factorialOf1 = afj.factorial(1);
        assertEquals(1,factorialOf1);
    }
    @Test
    void factorial2() {
        int factorialOf2 = afj.factorial(2);
        assertEquals(2,factorialOf2);
    }
    @Test
    void factorial3() {
        int factorialOf3 = afj.factorial(3);
        assertEquals(6,factorialOf3);
    }
    @Test
    void factorial4() {
        int factorialOf4 = afj.factorial(4);
        assertEquals(24,factorialOf4);
    }
    @Test
    void factorial10() {
        int factorialOf10 = afj.factorial(10);
        assertEquals(3628800,factorialOf10);
    }

    @Test
    void indexOfFirstOccurrence() {
    }

    @Test
    void yearsTilOneMillion() {
    }

    @Test
    void printInReverse() {
    }

    @Test
    void findRange() {
    }

    @Test
    void diceRoll() {
    }

    @Test
    void monopolyRoll() {
    }
}