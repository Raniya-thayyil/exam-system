package examinationsystem;

import java.util.HashMap;

public class Question {

    private int number;

    private String problemStatement;
    private double mark;
    private int answerKey;
    private Subject subject;

    HashMap<Integer, String> choices = new HashMap<>();
   
    public Question(int number, String problemStatement, double mark, Subject subject) {
        this.number = number;
        this.problemStatement = problemStatement;
        this.mark = mark;
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark > 0) {
            this.mark = mark;
        }
    }

    public int getAnswer() {
        return answerKey;
    }

    public void setAnswer(int answerKey) {
        this.answerKey = answerKey;
    }

    public HashMap<Integer, String> getChoices() {
        return choices;
    }

    public void setChoices(int key, String option) {
        this.choices.put(key, option);
    }

    public String getProblemStatement() {
        return problemStatement;
    }    

    public Subject getSubject() {
        return subject;
    }


    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Question [problemStatement=" + problemStatement + ", mark=" + mark + ", choices="
                + choices + "]";
    }

}
