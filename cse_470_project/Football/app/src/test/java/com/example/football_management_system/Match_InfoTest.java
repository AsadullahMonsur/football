package com.example.football_management_system;

import com.example.football_management_system.accessories.Match_Info;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Match_InfoTest {
    Match_Info x;
    @Before
    public void setUp() throws Exception{
        x = new Match_Info("x","x","x");
    }

    @Test
    public void testGetMatch_id() {
        assertEquals("x","x","x");
    }

    @Test
    public void testGetMatch_venue() {
        assertEquals("x",x.getMatch_venue());
    }

    @Test
    public void testGetPatch() {
        assertEquals("x",x.getPatch());
    }
}
