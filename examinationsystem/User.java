package examinationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private int age;
    private String gender;

    ArrayList<Integer> optionsChoosed = new ArrayList<>() ;

    private int correctedAnswerCount;
    private double optainedMark;

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }    

    public int getCorrectedAnswerCount() {
        return correctedAnswerCount;
    }

    public void setCorrectedAnswerCount(int correctedAnswerCount) {
        this.correctedAnswerCount = correctedAnswerCount;
    }

    public double getOptainedMark() {
        return optainedMark;
    }

    public void setOptainedMark(double optainedMark) {
        this.optainedMark = optainedMark;
    }

    public ArrayList<Integer> attendExam(Examination exam) {

        for (int i = 0; i < exam.questionPaper.questions.size(); i++) {
            System.out.println("choose option for question: " + exam.questionPaper.getQuestionOf(i + 1) + " : ");
            int answer = scanner.nextInt();            
            this.optionsChoosed.add(answer);            
        }
        return optionsChoosed;

    }
    
    public void viewResult(Examination exam) {
        System.out.println("corrected nswers: " + this.getCorrectedAnswerCount());
        System.out.println("total mark is: " + this.getOptainedMark());

        for (int i = 0; i < exam.questionPaper.questions.size(); i++) {
            
            System.out.println("choosed option: " + this.optionsChoosed.get(i)  + " , "  +  "correct answer: " + exam.questionPaper.questions.get(i).getAnswer());           
        }
        
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
