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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author x
 */
public class OszthatosagMockTest {
    
    public OszthatosagMockTest() {
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
    public void testOszthatoE_UsingAMock() {
        System.out.println("maradek");
        int szam = 5;//tesztadatok bemenet
        int mivel =2;//tesztadatok bemenet
        int maradek=1;//tesztadatok kimenet
        MaradekService maradekServiceMock=mock(MaradekService.class);
        
        when(maradekServiceMock.maradek(szam,mivel)).thenReturn(maradek);
        Oszthatosag oszthatosag=new Oszthatosag(maradekServiceMock);
        
        
        boolean result = oszthatosag.oszthatoE(szam,mivel);
        assertEquals(false, result);
    }
    
    
}
