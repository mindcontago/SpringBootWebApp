
package com.archie.SpringBootWebApp100.repositoty;

import com.archie.SpringBootWebApp100.entity.Student;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query("select s from Student s where name like %?1%")//Чтобы показывать по одной букве поиск
    List<Student> findByName(String name, PageRequest pageable);

    List<Student> findAllByName(String name);

    @Query("select u from Student u where u.id like '%?1%'")
    List<Student> findAllById(String name);

    @Query(value = "select * from Student where position like '%developer%'", nativeQuery = true)
    List<Student> findWherePositionIsDeveloper(String position);

    List<Student> findByPosition(String position);


    //если и этого мало - можно написать запрос на чистом SQL и все это будет работать



}
