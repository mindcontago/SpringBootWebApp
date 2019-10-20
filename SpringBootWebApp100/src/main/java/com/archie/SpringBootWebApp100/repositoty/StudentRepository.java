package com.archie.SpringBootWebApp100.repositoty;

import com.archie.SpringBootWebApp100.entity.Student;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>,
        JpaSpecificationExecutor<Student> {
    @Query(value = "select * from Student where position like '%developer%'", nativeQuery = true)
    List<Student> findByPosition(String position);


}
