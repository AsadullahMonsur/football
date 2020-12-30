package com.example.football_management_system;

import com.example.football_management_system.accessories.Goal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoalTest {
    Goal x;
    @Before
    public void setUp() throws Exception{
        x = new Goal("x",100,"x");
    }

    @Test
    public void testGetPlayer_id() {
        assertEquals("x",x.getPlayer_id());
    }

    @Test
    public void testGetGoal() {
        assertEquals(100,x.getGoal());
    }

    @Test
    public void testGetPatch(){
        assertEquals("x",x.getPatch());
    }

}
