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
public class DBUtilsTest {
    
    public DBUtilsTest() {
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
     * Test of getStudent method, of class DBUtils.
     */
//    @Test
//    public void testGetStudent() {
//        System.out.println("getStudent");
//        String no = "";
//        DBUtils instance = new DBUtils();
//        Student expResult = null;
//        Student result = instance.getStudent(no);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addStudent method, of class DBUtils.
//     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student st = null;
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.addStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStudent method, of class DBUtils.
//     */
//    @Test
//    public void testUpdateStudent() {
//        System.out.println("updateStudent");
//        Student st = null;
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.updateStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStudent method, of class DBUtils.
//     */
//    @Test
//    public void testDeleteStudent() {
//        System.out.println("deleteStudent");
//        String no = "";
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.deleteStudent(no);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testStudentCRUD() {
        System.out.println("student crud");
        
        Student student = new Student("ST01", "John", "1990", true);
        
        DBUtils instance = new DBUtils();

        // Test add functionality
        boolean result = instance.addStudent(student);
        assertEquals(true, result);
        
        Student actualStudent = instance.getStudent(student.getNo());

        assertEquals(student.getNo(), actualStudent.getNo());
        assertEquals(student.getName(), actualStudent.getName());
        assertEquals(student.getDob(), actualStudent.getDob());
        assertEquals(student.isIsMale(), actualStudent.isIsMale());
        
        // Test the update functionality
        student = new Student("ST01", "Ann", "1993", false);
        result = instance.updateStudent(student);
        assertEquals(true, result);
        
        actualStudent = instance.getStudent(student.getNo());

        assertEquals(student.getNo(), actualStudent.getNo());
        assertEquals(student.getName(), actualStudent.getName());
        assertEquals(student.getDob(), actualStudent.getDob());
        assertEquals(student.isIsMale(), actualStudent.isIsMale());
        
        // Test the delete functionality
        result = instance.deleteStudent(student.getNo());
        assertEquals(true, result);
        
        actualStudent = instance.getStudent(student.getNo());
        assertEquals(null, actualStudent);   
    }  
}
