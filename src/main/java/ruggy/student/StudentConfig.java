package ruggy.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            // This is for ruggy
            Student ruggy = new Student(
                "Ruggy",
                "jastonruggy@icloud.com",
                LocalDate.of(1998, Month.SEPTEMBER, 04),
                21
            );

            // This is for jarred
            Student jarred = new Student(
                "Jarred",
                "jarred@icloud.com",
                LocalDate.of(1990, Month.SEPTEMBER, 04),
                21
            );

            // This is for mama
            Student mama = new Student(
                "Mama",
                "mama@icloud.com",
                LocalDate.of(1970, Month.SEPTEMBER, 04),
                21
            );

            repository.saveAll(
                List.of(ruggy, jarred, mama)
            );
        };
    }
}
