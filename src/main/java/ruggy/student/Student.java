package ruggy.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(
            Long id,
            String name,
            String email,
            LocalDate dob,
            Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(
            String name,
            String email,
            LocalDate dob,
            Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
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
        return age;
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
