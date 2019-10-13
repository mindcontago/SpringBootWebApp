

package com.archie.SpringBootWebApp100;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWebApp100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApp100Application.class, args);
    }
    @Bean
    public CommandLineRunner init(StudentRepository repository) {
        return args -> {

            repository.save(new Student(null, "vova", "555", "bmw"));
            repository.save(new Student(null, "masha", "666", "nissan"));
            repository.save(new Student(null, "sasha", "444", "audi"));
            repository.save(new Student(null, "tanya", "777", "toyota"));
            repository.save(new Student(null, "artem", "111", "audi"));
            repository.save(new Student(null, "alex", "222", "mazda"));
            repository.save(new Student(null, "mike", "000", "lexus"));
            repository.save(new Student(null, "tom", "333", "porsche"));
            repository.save(new Student(null, "max", "888", "honda"));
            repository.save(new Student(null, "jeff", "456", "volvo"));
            repository.save(new Student(null, "rachel", "123", "mercedes"));
            repository.save(new Student(null, "joe", "987", "dodge"));
            repository.save(new Student(null, "rozz", "432", "chevrolet"));
            repository.save(new Student(null, "chandler", "004", "bmw"));
            repository.save(new Student(null, "monica", "451", "lexus"));
            repository.save(new Student(null, "stan", "004", "audi"));

        };
    }
}






