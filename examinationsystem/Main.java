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

        Question q1 = new Question(1, "Light year is a unit of which of these following", 5,physics);
        q1.setChoices(1, "distance");
        q1.setChoices(2, "time");
        q1.setChoices(3, "power");
        q1.setAnswer(1);

        Question q2 = new Question(2, "What is the unit of Specific gravity", 5, physics);
        q2.setChoices(1, "kg m-3");
        q2.setChoices(2, "No unit");
        q2.setChoices(3, "kg m-2");
        q2.setAnswer(2);

        Question q3 = new Question(3, " homogeneous mixture of two or more substances in called:", 5, chemistry);
        Question q4 = new Question(4, "an element that is malleable and ductile, and conducts electricity called?", 5, chemistry);

        Question q5 = new Question(1, "largest bone in the human body", 5, biology);
        q5.setChoices(1, "stapes");
        q5.setChoices(2, "femur");
        q5.setChoices(3, "tibia");
        q5.setAnswer(2);

        Question q6 = new Question(2, "largest organ in the human body", 5, biology);  
        q6.setChoices(1, "skin");  
        q6.setChoices(2, "heart"); 
        q6.setChoices(3, "liver");  
        q6.setAnswer(1);

        QuestionPaper physicsChemistrySetOnePaper = new QuestionPaper();        
        physicsChemistrySetOnePaper.setQuestion(q1);
        physicsChemistrySetOnePaper.setQuestion(q2);
        // physicsChemistrySetOnePaper.setQuestion(q3);
        // physicsChemistrySetOnePaper.setQuestion(q4);
        physicsChemistrySetOnePaper.setTotalMark();

        QuestionPaper biologySetTwoPaper = new QuestionPaper();
        biologySetTwoPaper.setQuestion(q5);
        biologySetTwoPaper.setQuestion(q6);

        Examination setOneExam = new Examination(1, physicsChemistrySetOnePaper);  
        Examination setTwoExam = new Examination(2, biologySetTwoPaper);     

        System.out.println("set 1 question paper: " + physicsChemistrySetOnePaper.getQuestions());
        System.out.println("total mark of physics: " + physicsChemistrySetOnePaper.getTotalMark());        
        System.out.println();

        System.out.println(setOneExam.exam(rani));
        System.out.println(setTwoExam.exam(rani));
        System.out.println();
        System.out.println(rani.getAllselectedOptions(setOneExam));
        
        // System.out.println("result of rani:");
        // rani.viewResult(physicsExam);  

        // System.out.println(q2.getAnswer());

         
        


    }
    
}
