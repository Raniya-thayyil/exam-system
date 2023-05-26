package examinationsystem;

import java.util.HashMap;

public class Question {

    private String problemStatement;
    private double mark;
    private int answerKey;

    public Question(String problemStatement, double mark) {

        this.problemStatement = problemStatement;
        this.mark = mark;
    }

    HashMap<Integer, String> choices = new HashMap<>();

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

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

    @Override
    public String toString() {
        return "Question [problemStatement=" + problemStatement + ", mark=" + mark + ", choices="
                + choices + "]";
    }

}
