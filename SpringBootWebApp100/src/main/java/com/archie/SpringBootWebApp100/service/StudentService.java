package com.archie.SpringBootWebApp100.service;

import com.archie.SpringBootWebApp100.MyCriteria;
import com.archie.SpringBootWebApp100.dto.MyDtoByCriteria;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listOfStudents(MyDtoByCriteria myDtoByCriteria) {// здесь получить лист критериев и возвр лист стубентов
        List<Sort.Order> list = new ArrayList<>();

        for (MyCriteria criteria : myDtoByCriteria.getCriterias()) {
            Sort.Order order;
            if (criteria.isAscend()) {
                order = new Sort.Order(Sort.Direction.ASC, criteria.getName());
            } else {
                order = new Sort.Order(Sort.Direction.DESC, criteria.getName());
                //Этот цткл добавил все критерии из МАЙ критериа - замапили в сорт ордер, может автоматич все сделать с по
            }   //добавить сорт карБренд и
            list.add(order);
        }

        return studentRepository.findAll(Sort.by(list));
    }


//    // GET
//    public Student getStudent(Long id) {
//        return StudentRepository.findOne(Long.toString(id));
//    }
//    // POST
//    public void addStudent(Student student) {
//        StudentRepository.save(student);
//    }
//
//    // PUT
//    public void updateStudent(Long id, Student student) {
//        StudentRepository.save(student);
//    }
//
//    // DELETE
//    public void deleteStudent(Long id) {
//        Student student = studentRepository.findOne(Long.toString(id));
//        studentRepository.delete(student);
//    }
}

//здесь будет логика, когда разьерусь Критерия биледр как работает

