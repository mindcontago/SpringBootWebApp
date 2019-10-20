package com.archie.SpringBootWebApp100.service;

import com.archie.SpringBootWebApp100.Criteria;
import com.archie.SpringBootWebApp100.dto.DtoByCriteria;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @Before
    public void init() {
        studentRepository.save(new Student(null, "AAA", "BBBB", "CCCCC", "BBBBBBBB"));
        studentRepository.save(new Student(null, "BBB", "CCCC", "AAAAA", "CCCCCCCC"));
        studentRepository.save(new Student(null, "CCC", "AAAA", "BBBBB", "AAAAAAAA"));
    }

    @Test
    public void testListOfStudents_NameCarbrandGosnumber() {
        Criteria name = new Criteria("name", true);
        Criteria carBrand = new Criteria("carBrand", true);
        Criteria gosNumber = new Criteria("gosNumber", true);
        DtoByCriteria dtoByCriteria = new DtoByCriteria();
        List<Criteria> list = new ArrayList<>();
        list.add(name);
        list.add(carBrand);
        list.add(gosNumber);
        dtoByCriteria.setCriterias(list);
        List<Student> result = studentService.listOfStudents(dtoByCriteria);
        Assert.assertEquals("AAA", result.get(0).getName());
        Assert.assertEquals("BBB", result.get(1).getName());
        Assert.assertEquals("CCC", result.get(2).getName());

    }


}