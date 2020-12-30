package com.example.football_management_system;

import com.example.football_management_system.accessories.View_Team_Statistics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class View_Team_StatisticsTest {
    View_Team_Statistics x;
    @Before
    public void setUp() throws Exception{
        x = new View_Team_Statistics("x","x",
                "x", "x","x",
                "x","x","x");
    }

    @Test
    public void testGetMatch_id() {
        assertEquals("x", x.getMatch_id());
    }

    @Test
    public void getList_of_scorer() {
        assertEquals("x", x.getList_of_scorer());
    }

    @Test
    public void getGoal_time() {
        assertEquals("x", x.getGoal_time());
    }

    @Test
    public void getList_of_got_injured() {
        assertEquals("x",x.getList_of_got_injured());
    }

    @Test
    public void getInjured_time() {
        assertEquals("x", x.getInjured_time());
    }

    @Test
    public void getList_of_got_card() {
        assertEquals("x", x.getList_of_got_card());
    }

    @Test
    public void getCard_time() {
        assertEquals("x",x.getCard_time());
    }

    @Test
    public void getCard_type() {

        assertEquals("x", x.getCard_type());
    }

}
