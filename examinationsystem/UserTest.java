package examinationsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
    @Test
    public void testSetAge() {

        User rani = new User("Rani", 24, "Female");

        int expected;
        int got;
        rani.setAge(25);

        expected = 25;
        got = rani.getAge();

        assertEquals(expected, got);

    }

 
}
