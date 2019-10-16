
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.archie.SpringBootWebApp100.controller;


import com.archie.SpringBootWebApp100.dto.MyDtoByCriteria;
import com.archie.SpringBootWebApp100.dto.NewDtoGet;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import com.archie.SpringBootWebApp100.service.GetService;
import com.archie.SpringBootWebApp100.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor //не нужно создавать конструктор
@RestController
public class StudentController {

    private final StudentRepository repository;//должна быть в сервисе

    @Autowired
    GetService getService;
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public List<Student> findAll(@RequestParam Optional<String> name,
                                 @RequestParam Optional<Integer> page,
                                 @RequestParam Optional<String> sortBy) {
        //return repository.findByName(name.orElse("_"),
        return repository.findByName(name.orElse("_"),
                new PageRequest(page.orElse(0), 15,
                        Sort.Direction.ASC, sortBy.orElse("id")));
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

//    @GetMapping("/getAll") //возвр по методу
//    public List<Student> findAll(){
//        return getService.get();
//    }

    @PutMapping("/criterias")
    public List<Student> findByCriterias(MyDtoByCriteria myDtoByCriteria) {
//        return repository.findAll(); //метод сделать сам. приним лист стрингов (из файнд бай критер (дто))
//    };
        return studentService.listOfStudents(myDtoByCriteria); //здесь вызвать метод котор выполн всю логику
    }
}

