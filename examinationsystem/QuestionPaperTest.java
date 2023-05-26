// package examinationsystem;

// import static org.junit.Assert.assertEquals;

// import org.junit.Test;

// public class QuestionPaperTest {
//     @Test
//     public void testGetQuestionOf() {
//         Subject physics = new Subject("Physics", "PHY343");

//         Question q1 = new Question("Light year is a unit of which of these following", 5);
//         Question q2 = new Question("What is the unit of Specific gravity", 5);

//         QuestionPaper physicPaper = new QuestionPaper(physics);
//         physicPaper.setQuestion(q1);
//         physicPaper.setQuestion(q2);


//         Question expected = q1;
//         Question got = physicPaper.getQuestionOf(1);

//         assertEquals(expected, got);

//     }

//     @Test
//     public void testSetTotalMark() {

//         Subject physics = new Subject("Physics", "PHY343");

//         Question q1 = new Question("Light year is a unit of which of these following", 5);
//         Question q2 = new Question("What is the unit of Specific gravity", 5);

//         QuestionPaper physicPaper = new QuestionPaper(physics);
//         physicPaper.setQuestion(q1);
//         physicPaper.setQuestion(q2);

//         physicPaper.setTotalMark();

//         Double expected;
//         Double got;

//         expected = 10.0;
//         got = physicPaper.getTotalMark();

//         assertEquals(expected, got);

//     }
// }
