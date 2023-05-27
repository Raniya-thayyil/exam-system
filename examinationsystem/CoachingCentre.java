package examinationsystem;

import java.util.ArrayList;

public class CoachingCentre {

    ArrayList<User> users = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();
    Examination exam;

    public void addUsers(User user) {
        users.add(user);
    }

    public void addsubjects(Subject subject) {
        subjects.add(subject);

    }

    public Examination getExam() {
        return exam;
    }

    public void setExam(Examination exam) {
        this.exam = exam;
    }

    public void evaluate(User user, Examination exam) {
        double totalMarkOfUser = 0;
        int correctedAnswers = 0;

        for (UserOption option : user.getAllselectedOptions(exam)) {
            if (option.getQuestion().getAnswer() == option.getChoosedOption()) {
                correctedAnswers++;
                totalMarkOfUser += option.getQuestion().getMark();
            } else {
                totalMarkOfUser -= 1;
            }
        }
        user.setCorrectedAnswerCount(correctedAnswers);
        user.setOptainedMark(totalMarkOfUser);
        System.out.println(user.getName() + " corrected " + correctedAnswers + " questions in " + exam.getName());
        System.out.println("optained mark of " + user.getName() + " : " + totalMarkOfUser + " out of "
                + exam.questionPaper.getTotalMark());

    }

}
