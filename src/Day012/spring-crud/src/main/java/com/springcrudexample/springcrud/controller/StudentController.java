package com.springcrudexample.springcrud.controller;

import com.springcrudexample.springcrud.entity.Student;
import com.springcrudexample.springcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    //For PostMapping

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students)
    {
        return service.saveStudents(students);
    }

    //For GetMapping
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id)
    {
        return service.getStudentById(id);
    }
    @GetMapping("/student/{name}")
    public Student findStudentByName(@PathVariable String name)
    {
        return service.getStudentByName(name);
    }

    //For Put Mapping
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student)
    {
        return service.updateStudent(student);
    }

    //For DeleteMapping
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return service.deleteStudent(id);
    }







}
