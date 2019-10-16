
package com.archie.SpringBootWebApp100.repositoty;
import com.archie.SpringBootWebApp100.entity.Student;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s where name like %?1%")//Чтобы показывать по одной букве поиск
    List<Student> findByName(String name, PageRequest pageable);
}