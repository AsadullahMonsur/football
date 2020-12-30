package com.example.football_management_system;

import com.example.football_management_system.owner.Objectives;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjectivesTest {
    Objectives x;
    @Before
    public void setUp() throws Exception{
        x = new Objectives("x","x","x");
    }

    @Test
    public void testGetId() {
        assertEquals("x",x.getId());
    }

    @Test
    public void testGetObjective() {
        assertEquals("x",x.getObjective());
    }

    @Test
    public void testGetPatch() {
        assertEquals("x",x.getPatch());
    }
}
