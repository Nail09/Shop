package array;

public class main {
    public static void main(String[] args) {
        Student student=new Student("Nail","Ablizov",140,4.0);
        Student student1=new Student("Alibek","Saginbaev",130,3.5);
        Student student2=new Student("Ramisa","Shalabaeva",110,2.9);
        Student student3=new Student("Erasyl","Koichukulov",0,3.0);

        University university=new University("IITU",2009);
        university.add(student);
        university.add(student1);
        university.add(student2);
        university.add(student3);
        System.out.println(university);
    }
}
