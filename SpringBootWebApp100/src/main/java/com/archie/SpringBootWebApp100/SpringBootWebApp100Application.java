

package com.archie.SpringBootWebApp100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class SpringBootWebApp100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApp100Application.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(SpringBootWebApp100Application.class);
    @Bean
    public CommandLineRunner init(StudentRepository repository) {
        return args -> {

//            repository.save(new Student(null, "vova", "555", "bmw"));
//            repository.save(new Student(null, "masha", "666", "nissan"));
//            repository.save(new Student(null, "sasha", "444", "audi"));
//            repository.save(new Student(null, "tanya", "777", "toyota"));
//            repository.save(new Student(null, "artem", "111", "audi"));
//            repository.save(new Student(null, "alex", "222", "mazda"));
//            repository.save(new Student(null, "mike", "000", "lexus"));
//            repository.save(new Student(null, "tom", "333", "porsche"));
//            repository.save(new Student(null, "max", "888", "honda"));
//            repository.save(new Student(null, "jeff", "456", "volvo"));
//            repository.save(new Student(null, "rachel", "123", "mercedes"));
//            repository.save(new Student(null, "joe", "987", "dodge"));
//            repository.save(new Student(null, "rozz", "432", "chevrolet"));
//            repository.save(new Student(null, "chandler", "004", "bmw"));
//            repository.save(new Student(null, "monica", "451", "lexus"));
//            repository.save(new Student(null, "stan", "004", "audi"));


            repository.save(new Student(null, "vova", "555", "bmw", "developer"));
            repository.save(new Student(null, "masha", "666", "nissan", "developer"));
            repository.save(new Student(null, "sasha", "444", "audi", "manager"));
            repository.save(new Student(null, "tanya", "777", "toyota", "developer"));
            repository.save(new Student(null, "artem", "111", "audi", "developer"));
            repository.save(new Student(null, "alex", "222", "mazda", "developer"));
            repository.save(new Student(null, "mike", "000", "lexus", "developer"));
            repository.save(new Student(null, "tom", "333", "porsche", "developer"));
            repository.save(new Student(null, "max", "888", "honda", "developer"));
            repository.save(new Student(null, "jeff", "456", "volvo", "developer"));
            repository.save(new Student(null, "rachel", "123", "mercedes", "manager"));
            repository.save(new Student(null, "joe", "987", "dodge", "manager"));
            repository.save(new Student(null, "ross", "432", "chevrolet", "manager"));
            repository.save(new Student(null, "chandler", "004", "bmw", "manager"));
            repository.save(new Student(null, "monica", "451", "lexus", "manager"));
            repository.save(new Student(null, "stan", "004", "audi", "manager"));

            // fetch all customers
            log.info("Students found with findAll():");
            log.info("-------------------------------");
            for (Student student : repository.findAll()) {
                log.info(student.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Optional<Student> student = repository.findById(2L);
            log.info("Students found with findById(2L):");
            log.info("--------------------------------");
            log.info(student.toString());
            log.info("");

            // fetch customers by name
            log.info("Students found with findByPosition('developer'):");
            log.info("--------------------------------------------");
            repository.findByPosition("developer").forEach(developer -> {
                log.info(developer.toString());
            });

            log.info("");
        };
    }
}




