
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.archie.SpringBootWebApp100;


import com.archie.SpringBootWebApp100.Student;
import com.archie.SpringBootWebApp100.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //не нужно создавать конструктор
@RestController
class StudentController {

    private final StudentRepository repository;

    @GetMapping("/student")
    public List<Student> findAll(@RequestParam Optional<String> name,
                                 @RequestParam Optional<Integer> page,
                                 @RequestParam Optional<String> sortBy) {
        return repository.findByName(name.orElse("_"),
                new PageRequest(page.orElse(0), 5,
                        Sort.Direction.ASC, sortBy.orElse("id")));
    }
}

