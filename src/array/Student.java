package array;

public class Student {

        private String name;
        private String surname;
        private int ENTpoints;
        private double gpa;

        public Student() {}

        public Student(String name, String surname, int ENTpoints, double gpa) {
            this.name = name;
            this.surname = surname;
            this.ENTpoints = ENTpoints;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getENTpoints() {
            return ENTpoints;
        }

        public void setENTpoints(int ENTpoints) {
            this.ENTpoints = ENTpoints;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public String toString(){
            return name+" "+surname+" "+ENTpoints+" "+gpa;
        }
    }

