package com.codegym.demo_springdatajpa_a10.controller;


import com.codegym.demo_springdatajpa_a10.dto.StudentDto;
import com.codegym.demo_springdatajpa_a10.model.Student;
import com.codegym.demo_springdatajpa_a10.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/student")
public class RestStudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("")
    public ResponseEntity<List<Student>> getList(){
        List<Student> studentList = studentService.findAll();
        if (studentList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody StudentDto studentDto){
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        boolean check = studentService.add(student);
        if (check){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        Student student = studentService.findById(id);
        if (student==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        studentService.delete(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("")
    public ResponseEntity<?> update(@RequestParam int id,@RequestBody StudentDto studentDto){
        Student student = studentService.findById(id);
        if (student==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        BeanUtils.copyProperties(studentDto,student);
        studentService.update(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
