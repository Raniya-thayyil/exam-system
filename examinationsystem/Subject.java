package examinationsystem;

public class Subject {

    private String name;
    private String subjectCode;

    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "Subject [name=" + name + ", subjectCode=" + subjectCode + "]";
    }  

    

    
    
}
