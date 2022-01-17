/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farm.osztomaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author x
 */
public class OszthatosagStubosTest {
    
    public OszthatosagStubosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOszthatoE_UsingAStub() {
        System.out.println("maradek");
        int szam = 5;
        int mivel =2;
        MaradekService maradekServiceStub=new MaradekServiceStub();
        Oszthatosag oszthatosag=new Oszthatosag(maradekServiceStub);
        
        //List<String> expResult = null;
        boolean result = oszthatosag.oszthatoE(szam,mivel);
        assertEquals(false, result);
    }
    
}
