package examinationsystem;

import java.util.ArrayList;

public class QuestionPaper {

    ArrayList<Question> questions = new ArrayList<>();
    Question question;
    Subject subject;
    double totalMark;

    public QuestionPaper(Subject subject) {
        this.subject = subject;        
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
   
    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark() {
        double total = 0;
        for (Question question : this.questions) {
            total += question.getMark();
        }
        this.totalMark = total;
    }

    public void setQuestion(Question question) {
        this.questions.add(question);
    }

    public Question getQuestionOf(int questionNumber) {
        return this.questions.get(questionNumber - 1);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "QuestionPaper [questions=" + questions + ", subject=" + subject + ", totalMark=" + totalMark + "]";
    }

    

}