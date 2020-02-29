package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Jacek", "Nowak", 32);
        Student student2 = new Student("Wacek", "Placek", 32);
        Student student3 = new Student("Artur", "Złom", 32);
        Student student4 = new Student("Tomasz", "Wafel", 32);
        Student student5 = new Student("Roman", "Abramowicz", 32);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        try {
            objectMapper.writeValue(new File("studentList.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("lista.json", studentList);
        jsonUtils.readlist("lista.json");
    }
}

