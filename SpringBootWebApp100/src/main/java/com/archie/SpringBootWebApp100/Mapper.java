package com.archie.SpringBootWebApp100;

import com.archie.SpringBootWebApp100.dto.NewDtoGet;
import com.archie.SpringBootWebApp100.entity.Student;

public class Mapper {
    public static NewDtoGet map (Student student){
        NewDtoGet newDtoGet =  new NewDtoGet();
        newDtoGet.setName(student.getName()); //Кадое поле - атк превратил Студен в ДТО
        return newDtoGet;
    }
}
