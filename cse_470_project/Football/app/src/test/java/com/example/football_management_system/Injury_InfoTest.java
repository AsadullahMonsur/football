package com.example.football_management_system;

import com.example.football_management_system.accessories.Injury_Info;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Injury_InfoTest {
    Injury_Info x;
    @Before
    public void setUp() throws Exception{
        x = new Injury_Info("x","x","x","x");
    }

    @Test
    public void testGetMatch_id() {
        assertEquals("x", x.getMatch_id());
    }

    @Test
    public void testGetPlayer_id() {
        assertEquals("x",x.getPlayer_id());
    }

    @Test
    public void testGetInjury_time() {
        assertEquals("x",x.getInjury_time());
    }

    @Test
    public void testGetPatch(){
        assertEquals("x",x.getPatch());
    }
}
