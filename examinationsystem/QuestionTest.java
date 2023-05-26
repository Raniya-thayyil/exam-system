package examinationsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestionTest {
    @Test
    public void testSetMark() {

        Question q1 = new Question("Light year is a unit of which of these following", 5);

        Double expected;
        Double got;

        q1.setMark(4);

        expected = 4.0;
        got = q1.getMark();

        assertEquals(expected, got);


       

    }
}
