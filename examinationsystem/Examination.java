package examinationsystem;

import java.util.ArrayList;

public class Examination {

    private int examCode;
    private String name;

    private Subject subject;
    private int totalmark;
    QuestionPaper questionPaper;

    ArrayList<QuestionPaper> QuestionPaper = new ArrayList<>();

    public Examination(int examCode, String name, QuestionPaper questionPaper) {
        
        this.questionPaper = questionPaper;
        this.examCode = examCode;
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
