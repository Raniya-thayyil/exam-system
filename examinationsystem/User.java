package examinationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private int age;
    private String gender;

    ArrayList<UserOption> optionsChoosed = new ArrayList<>();

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

    public ArrayList<UserOption> getAllselectedOptions(Examination exam) {
        ArrayList<UserOption> optionDetails = new ArrayList<>();

        for (UserOption optionsDetail : this.optionsChoosed) {
            if (optionsDetail.getExamCode() == exam.getExamCode()) {
                optionDetails.add(optionsDetail);

            }
        }
        return optionDetails;
    }

    public ArrayList<UserOption> attendExam(Examination exam) {
        UserOption markOption = new UserOption();
        for (Question q : exam.questionPaper.questions) {

            System.out.println("choose option for question: " + q + " : ");
            int answer = scanner.nextInt();
            markOption = new UserOption(exam.getExamCode(), q, answer);
            this.optionsChoosed.add(markOption);
        }
        return this.optionsChoosed;
    }

    public void viewResult(Examination exam) {
        System.out.println("result of " + this.getName() + " in " + exam.getName() + " : ");
        System.out.println("corrected nswers: " + this.getCorrectedAnswerCount());
        System.out.println("total mark is: " + this.getOptainedMark());

    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
