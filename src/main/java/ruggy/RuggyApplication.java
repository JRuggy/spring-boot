package ruggy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ruggy.student.Student;

import java.time.LocalDate;
// This imports all lists
import java.util.List;
@SpringBootApplication
@RestController
public class RuggyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuggyApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(
				1L,
				"Ruggy",
				"jastonruggy@icloud.com",
				LocalDate.of(1999, 9, 04),
				21
			)
		);
	}

}
