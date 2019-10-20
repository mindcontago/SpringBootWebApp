package com.archie.SpringBootWebApp100.service;

import com.archie.SpringBootWebApp100.Criteria;
import com.archie.SpringBootWebApp100.dto.DtoByCriteria;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> listOfStudents(DtoByCriteria dtoByCriteria) {
        List<Sort.Order> list = new ArrayList<>();

        for (Criteria criteria : dtoByCriteria.getCriterias()) {
            Sort.Order order;
            if (criteria.isAscend()) {
                order = new Sort.Order(Sort.Direction.ASC, criteria.getName());
            } else {
                order = new Sort.Order(Sort.Direction.DESC, criteria.getName());
            }
            list.add(order);
        }
        return studentRepository.findAll(Sort.by(list));
    }
}


