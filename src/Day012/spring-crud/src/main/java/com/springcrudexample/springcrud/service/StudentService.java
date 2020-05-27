package com.springcrudexample.springcrud.service;

import com.springcrudexample.springcrud.entity.Student;
import com.springcrudexample.springcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    //For Post Methods
    public Student saveStudent(Student student)
    {
        return repository.save(student);
    }

    //For saving all or list of students at a time
    public List<Student> saveStudents(List<Student> students)
    {
        return repository.saveAll(students);
    }

    //For Get Methods
    public List<Student> getStudent()
    {
        return repository.findAll();
    }

    public Student getStudentById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //For fetching by name
    public Student getStudentByName(String name)
    {
        return repository.findByName(name);
    }

    //For delete Method
    public String deleteStudent(int id)
    {
        repository.deleteById(id);
        return "Student removed !!"+id;
    }

    //Update method
    public Student updateStudent(Student student)
    {
        Student existingStudent=repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setRegistrationNumber(student.getRegistrationNumber());
        return repository.save(existingStudent);
    }

}
