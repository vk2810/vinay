/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

import junit.framework.TestCase;

/**
 *
 * @author Abhishek,Rahul
 */
public class FacultyTest extends TestCase {
    
    public FacultyTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of isidpassequal method, of class Faculty.
     */
    public void testIsidpassequal() {
        System.out.println("isidpassequal");
        String pass = "";
        int id = 0;
        Faculty instance = new Faculty();
        boolean expResult = false;
        boolean result = instance.isidpassequal(pass, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upload method, of class Faculty.
     */
    public void testUpload() {
        System.out.println("upload");
        Faculty instance = new Faculty();
        instance.upload();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editAttend method, of class Faculty.
     */
    public void testEditAttend() {
        System.out.println("editAttend");
        Faculty instance = new Faculty();
        instance.editAttend();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateofchange method, of class Faculty.
     */
    public void testDateofchange() {
        System.out.println("dateofchange");
        Faculty instance = new Faculty();
        instance.dateofchange();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
