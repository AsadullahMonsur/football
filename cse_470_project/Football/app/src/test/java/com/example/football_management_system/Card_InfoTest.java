package com.example.football_management_system;

import com.example.football_management_system.accessories.Card_Info;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Card_InfoTest {
    Card_Info x;
    @Before
    public void setUp() throws Exception{
        x = new Card_Info("x","x",
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
    public void testGetCard_type() {
        assertEquals("x", x.getCard_type());
    }

    @Test
    public void testGetCard_time() {
        assertEquals("x", x.getCard_time());
    }

    @Test
    public void testGetPatch(){
        assertEquals("x", x.getPatch());
    }

}
