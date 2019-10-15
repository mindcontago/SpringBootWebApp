
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.archie.SpringBootWebApp100;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //не нужно создавать конструктор
@RestController
public class StudentController {

    private final StudentRepository repository;//должна быть в сервисе

    @GetMapping("/student")
    public List<Student> findAll(@RequestParam Optional<String> name,
                                 @RequestParam Optional<Integer> page,
                                 @RequestParam Optional<String> sortBy) {
        return repository.findByName(name.orElse("_"),
                new PageRequest(page.orElse(0), 15,
                        Sort.Direction.ASC, sortBy.orElse("id")));
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @PutMapping("/criterias")
    public List<Student> findByCriterias(@RequestBody MyDto myDto) {
//        return repository.findAll(); //метод сделать сам. приним лист стрингов (из файнд бай критер (дто))
//    };
        return new StudentService().helloWorld(myDto); //здесь вызвать метод котор выполн всю логику
    }
}

