package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        Student student = new Student("Julia Veselkina");
        student.setKnowledge(new Knowledge(193));
        university.addStudent(student);

        student = new Student("Maria Perechrest");
        student.setKnowledge(new Knowledge(134));
        university.addStudent(student);

        student = new Student("Andrew Maslenko");
        student.setKnowledge(new Knowledge(178));
        university.addStudent(student);

        student = new Student("Andrew Kostenko");
        student.setKnowledge(new Knowledge(145));
        university.addStudent(student);


        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        
    }
}
