package examinationsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestionTest {
@Test
public void testSetMark() {
    Subject physics = new Subject("Physics", "PHY343");

Question q1 = new Question(1, "Light year is a unit of which of these following", 5, physics);

Double expected;
Double got;

q1.setMark(4);

expected = 4.0;
got = q1.getMark();

assertEquals(expected, got);

}
}
