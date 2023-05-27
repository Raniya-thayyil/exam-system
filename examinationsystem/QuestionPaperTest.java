package examinationsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestionPaperTest {
    @Test
    public void testGetQuestionOf() {
        Subject physics = new Subject("Physics", "PHY343");

        Question q1 = new Question(1, "Light year is a unit of which of these following", 5, physics);
        Question q2 = new Question(2, "What is the unit of Specific gravity", 5, physics);

        QuestionPaper physicPaper = new QuestionPaper();
        physicPaper.setQuestion(q1);
        physicPaper.setQuestion(q2);

        Question expected = q1;
        Question got = physicPaper.getQuestionOf(1);

        assertEquals(expected, got);

    }

    @Test
    public void testSetTotalMark() {

        Subject physics = new Subject("Physics", "PHY343");

        Question q1 = new Question(1, "Light year is a unit of which of these following", 5, physics);
        Question q2 = new Question(2, "What is the unit of Specific gravity", 5, physics);

        QuestionPaper set1 = new QuestionPaper();
        set1.setQuestion(q1);
        set1.setQuestion(q2);

        set1.setTotalMark();

        Double expected;
        Double got;

        expected = 10.0;
        got = set1.getTotalMark();

        assertEquals(expected, got);

    }
}
