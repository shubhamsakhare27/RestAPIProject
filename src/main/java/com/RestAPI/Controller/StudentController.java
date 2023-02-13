package com.RestAPI.Controller;

import com.RestAPI.Exception.CustomException;
import com.RestAPI.Model.Student;
import com.RestAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/api/create")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Transactional
    @PostMapping("/object")
    public String saveData(@RequestBody Student student){

        studentService.saveData(student);

        return "data save";
    }

    @ExceptionHandler(CustomException.class)
  @GetMapping("/getObject/{id}")
  public Student getData(@PathVariable(value = "id") int id){
        Student student = studentService.getData(id);
        return student;
  }



}
