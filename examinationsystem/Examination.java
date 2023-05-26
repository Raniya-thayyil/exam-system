package examinationsystem;

import java.util.ArrayList;

public class Examination {

    private Subject subject;
    private int totalmark;
    QuestionPaper questionPaper;

    ArrayList<QuestionPaper> QuestionPaper = new ArrayList<>();

    public Examination(Subject subject, QuestionPaper questionPaper) {

        this.subject = subject;
        this.questionPaper = questionPaper;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getTotalmark() {
        return totalmark;
    }

    public void setTotalmark(int totalmark) {
        this.totalmark = totalmark;
    }

    public void exam(User user) {
        user.attendExam(this);
    }

}
