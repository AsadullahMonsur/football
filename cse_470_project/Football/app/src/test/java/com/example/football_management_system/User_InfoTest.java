package com.example.football_management_system;

import com.example.football_management_system.accessories.User_Info;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class User_InfoTest {
    User_Info x;
    @Before
    public void setUp() throws Exception{
        x = new User_Info("x","x","x","x",3);
//        x = new User_Info("x","x","x","x");
//        x = new User_Info("x","x","x","x","x",1);
//        x = new User_Info("x","x","x","x","x","x",2);
    }

    @Test
    public void testGetId() {
        //assertEquals("x",x.getId());
    }

    @Test
    public void testGetName() {
        //assertEquals("x",x.getName());
    }

    @Test
    public void testGetF_name() {
        assertEquals("x",x.getF_name());
    }

    @Test
    public void testGetL_name() {
        assertEquals("x",x.getL_name());
    }

    @Test
    public void testGetCountry() {
        assertEquals("x",x.getF_name());
    }

    @Test
    public void testGetMail() {
        assertEquals("x",x.getMail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("x",x.getPassword());
    }

    @Test
    public void testGetAge() {
    //    assertEquals("x",x.getAge());
    }

    @Test
    public void testGetPosition() {
  //      assertEquals("x",x.getPosition());
    }

    @Test
    public void testGetFlag() {
        assertEquals(3,x.getFlag());
    }

}
