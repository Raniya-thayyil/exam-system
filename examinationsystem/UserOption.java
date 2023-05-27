package examinationsystem;

public class UserOption {
   
    private Question question;
    private int choosedOption;
    private int examCode;

    public UserOption(int examCode, Question question, int choosedOption) {
        this.question = question;
        this.choosedOption = choosedOption;
        this.examCode = examCode;
    }
    public UserOption() {

    }
    
    public int getChoosedOption() {
        return choosedOption;
    }
    public void setChoosedOption(int choosedOption) {
        this.choosedOption = choosedOption;
    }
    public int getExamCode() {
        return examCode;
    }
    public void setExamCode(int examCode) {
        this.examCode = examCode;
    }
    public Question getQuestion() {
        return question;
    }
    public void setQuestion(Question question) {
        this.question = question;
    }
   
    @Override
    public String toString() {
        return "UserOption [examCode="
        + examCode + ", questionNumber=" + this.question.getNumber() + ", choosedOption=" + choosedOption + "]";
    }   
    

    
}
