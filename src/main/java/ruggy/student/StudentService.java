package ruggy.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
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
