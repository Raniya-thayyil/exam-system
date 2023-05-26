package examinationsystem;

public class Main {

    public static void main(String[] args) {
        
        CoachingCentre pscCentre = new CoachingCentre();

        User boby = new User("Boby", 25, "Male");
        User rani = new User("Rani", 24, "Female");

        Subject physics = new Subject("Physics", "PHY343");
        Subject chemistry = new Subject("Chemistry", "CH564");
        Subject biology = new Subject("Biology", "BIO232");

        pscCentre.addUsers(rani);
        pscCentre.addUsers(boby);

        pscCentre.addsubjects(biology);
        pscCentre.addsubjects(chemistry);
        pscCentre.addsubjects(physics);

        Question q1 = new Question("Light year is a unit of which of these following", 5);
        Question q2 = new Question("What is the unit of Specific gravity", 5);
        Question q3 = new Question(" homogeneous mixture of two or more substances in called:", 5);
        Question q4 = new Question("an element that is malleable and ductile, and conducts electricity called?", 5);
        Question q5 = new Question("largest bone in the human body", 5);
        Question q6 = new Question("largest organ in the human body", 5);

        q1.setChoices(1, "distance");
        q1.setChoices(2, "time");
        q1.setChoices(3, "power");
        q1.setAnswer(1);

        q2.setChoices(1, "kg m-3");
        q2.setChoices(2, "No unit");
        q2.setChoices(2, "kg m-2");
        q2.setAnswer(2);

        QuestionPaper physicPaper = new QuestionPaper(physics);
        physicPaper.setQuestion(q1);
        physicPaper.setQuestion(q2);
        physicPaper.setTotalMark();

        Examination physicsExam = new Examination(physics, physicPaper);       

        System.out.println("physics question paper: " + physicPaper.getQuestions());
        System.out.println("total mark of physics: " + physicPaper.getTotalMark());        
        System.out.println();

        physicsExam.exam(rani);
        pscCentre.evaluate(rani, physicsExam);
        System.out.println("result of rani:");
        rani.viewResult(physicsExam);   


    }
    
}
