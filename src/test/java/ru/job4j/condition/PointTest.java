package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to03then3dot6() {
        double expected = 3.6;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2dot828() {
        double expected = 2.828;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}