package com.RestAPI.Service;

import com.RestAPI.Model.Student;
import com.RestAPI.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public void saveData(Student student) {
        studentRepository.save(student);

    }

    public Student getData(int id) {


        return studentRepository.findById(id).get();

        // .orElseThrow(() -> new CustomException(new ResponseEntity<>( HttpStatus.BAD_REQUEST)));
        //return student;
        }
}
