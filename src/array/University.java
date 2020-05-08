package array;

import java.util.ArrayList;

public class University {
    private String name;
    private int year;
    private ArrayList<Student> students=new ArrayList<>();

    public University() {}

    public University(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public University(String name, int year, ArrayList<Student> students) {
        this.name = name;
        this.year = year;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void add(Student student){
        students.add(student);
    }

    public int getStudentsAmount(){
        return students.size();
    }

    public double getAverageGPA(){
        double avg=0;
        for(int i=0;i<students.size();i++){
            avg+=students.get(i).getGpa();
        }
        return (double)(avg/students.size());
    }

    public double getAverageENTpoints(){
        double avg=0;
        for(int i=0;i<students.size();i++){
            avg+=students.get(i).getENTpoints();
        }
        return (double)(avg/students.size());
    }

    public String toString(){
        String str="";
        for(int i=0;i<students.size();i++){
            str+=students.get(i)+"\n";
        }
        str+="Students amount: "+getStudentsAmount()+"\n";
        str+="Average gpa: "+getAverageGPA()+"\n";
        str+="Average ENTpoints: "+getAverageENTpoints()+"\n";
        return name+"\n"+str;
    }
}
