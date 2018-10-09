package institution;

import person.Student;

import java.util.ArrayList;

public class University {

    String mName;
    ArrayList<Student> mStudents = new ArrayList<>();

    public University(String name) {
        mName = name;
    }

    public void addStudent(Student student) {
        mStudents.add(student);
    }
}
