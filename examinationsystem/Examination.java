package examinationsystem;

import java.util.ArrayList;

public class Examination {

    private int examCode;

    private Subject subject;
    private int totalmark;
    QuestionPaper questionPaper;

    ArrayList<QuestionPaper> QuestionPaper = new ArrayList<>();

    public Examination(int examCode, QuestionPaper questionPaper) {

        
        this.questionPaper = questionPaper;
        this.examCode = examCode;
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

    public ArrayList<UserOption> exam(User user) {
        return user.attendExam(this);
    }

    public int getExamCode() {
        return examCode;
    }

    public void setExamCode(int examCode) {
        this.examCode = examCode;
    }

    

}
