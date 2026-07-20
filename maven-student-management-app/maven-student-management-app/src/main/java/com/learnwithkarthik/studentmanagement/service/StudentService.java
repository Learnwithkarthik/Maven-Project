package com.learnwithkarthik.studentmanagement.service;

import com.learnwithkarthik.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(0);

    public StudentService() {
        students.add(new Student(
                idGenerator.incrementAndGet(),
                "Karthik",
                "karthik@example.com",
                "DevOps",
                26
        ));

        students.add(new Student(
                idGenerator.incrementAndGet(),
                "Anjali",
                "anjali@example.com",
                "Google Cloud",
                24
        ));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }

    public Student createStudent(Student student) {
        student.setId(idGenerator.incrementAndGet());
        students.add(student);
        return student;
    }

    public Optional<Student> updateStudent(Long id, Student updatedStudent) {
        Optional<Student> existingStudent = getStudentById(id);

        existingStudent.ifPresent(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setCourse(updatedStudent.getCourse());
            student.setAge(updatedStudent.getAge());
        });

        return existingStudent;
    }

    public boolean deleteStudent(Long id) {
        return students.removeIf(student -> student.getId().equals(id));
    }
}
