package ruggy.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // This is for adding students
    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        // condition to check if the data in variable email is existing
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email's taken");
        }
        studentRepository.save(student);
    }

    // This is for deleting students
    public void deleteStudent(Long studentId) {
        // studentRepository.findById(studentId);
        boolean exists = studentRepository.existsById(studentId);

        if(!exists){
            throw new  IllegalStateException("Student with id " + studentId + " doesn't exists");
        }
        studentRepository.deleteById(studentId);
    }
}
