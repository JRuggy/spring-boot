package ruggy.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;

    @Transient
    private Integer age;

    public Student() {
    }

    public Student(
            Long id,
            String name,
            String email,
            LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(
            String name,
            String email,
            LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    // For id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // for dob
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // for age
    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",email='" + email + '\'' +
                ",dob='" + dob + '\'' +
                ",age='" + age + '\'' +
                '}';
    }

}
