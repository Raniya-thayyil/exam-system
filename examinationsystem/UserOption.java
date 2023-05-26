package examinationsystem;

public class UserOption {

    private int questionNumber;
    private int choosedOption;
    private int examCode;

    public UserOption(int examCode, int questionNumber, int choosedOption) {
        this.questionNumber = questionNumber;
        this.choosedOption = choosedOption;
        this.examCode = examCode;
    }
    public UserOption() {

    }
        
    public int getQuestionNumber() {
        return questionNumber;
    }
    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
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
    @Override
    public String toString() {
        return "UserOption [examCode="
        + examCode + ", questionNumber=" + questionNumber + ", choosedOption=" + choosedOption + ", ]";
    }
   
   
    
    
    

    
}
