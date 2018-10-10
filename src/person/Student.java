package person;

import person.consciousness.Knowledge;

public class Student {
    String mName;
    Knowledge mKnowledge;

    public Student(String name) {
        mName = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        mKnowledge = knowledge;
    }
}
