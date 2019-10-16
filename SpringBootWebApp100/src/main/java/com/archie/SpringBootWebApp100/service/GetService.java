package com.archie.SpringBootWebApp100.service;

import com.archie.SpringBootWebApp100.dto.NewDtoGet;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class GetService {
    @Autowired
    StudentRepository studentRepository;
    public List<NewDtoGet> get(){
        List<NewDtoGet> result = new ArrayList<>();
        List<Student> students = studentRepository.findAll();//получил лист Студ, нужно по всем студ замапить в ДТО и добавит  в резаль и
        // потом вернуть резалт
        return result;

    }
}
