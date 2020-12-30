package com.example.football_management_system;

import com.example.football_management_system.accessories.Goal_Info;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Goal_InfoTest {
    Goal_Info x;
    @Before
    public void setUp() throws Exception{
        x = new Goal_Info("x","x",
                "x","x","x");
    }

    @Test
    public void testGetMatch_id() {

        assertEquals("x", x.getMatch_id());
    }

    @Test
    public void testGetPlayer_id() {
        assertEquals("x", x.getPlayer_id());
    }

    @Test
    public void testGetGoal_no() {
        assertEquals("x",x.getGoal_no());
    }

    @Test
    public void testGetGoal_time() {
        assertEquals("x", x.getMatch_id());
    }

    @Test
    public void testGetPatch(){
        assertEquals("x", x.getPatch());
    }

}
