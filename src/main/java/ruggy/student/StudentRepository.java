package ruggy.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    // select from student where email = ?
    Optional<Student> findStudentByEmail(String email);
}
