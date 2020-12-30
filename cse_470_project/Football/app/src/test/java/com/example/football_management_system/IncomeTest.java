package com.example.football_management_system;

import com.example.football_management_system.accessories.Income;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncomeTest {
    Income x;
    @Before
    public void setUp() throws Exception{
        x = new Income("x","x","x","x");
    }

    @Test
    public void testGetId() {
        assertEquals("x",x.getId());
    }

    @Test
    public void testGetIncome() {
        assertEquals("x",x.getIncome());
    }

    @Test
    public void testGetBonus() {
        assertEquals("x",x.getBonus());
    }

    @Test
    public void testGetPatch() {
        assertEquals("x",x.getPatch());
    }

}
