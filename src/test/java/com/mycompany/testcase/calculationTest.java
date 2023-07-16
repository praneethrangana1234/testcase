/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testcase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class calculationTest {
    
    public calculationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of caladd method, of class calculation.
     */
    @Test
    public void testCaladd() {
        System.out.println("caladd");
        int no1 = 2;
        int no2 = 3;
        calculation instance = new calculation();
        int expResult = 5;
        int result = instance.caladd(no1, no2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalmin() {
        System.out.println("caladd");
        int no1 = -2;
        int no2 = -3;
        calculation instance = new calculation();
        int expResult = -5;
        int result = instance.caladd(no1, no2);
        assertEquals(expResult, result);
        
    }
}
