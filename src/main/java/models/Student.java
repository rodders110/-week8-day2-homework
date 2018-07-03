package models;



import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private  int id;
    private String firstName;
    private String lastName;
    private int age;
    private int enrolment_number;
    private Course course;



    public Student() {
    }

    public Student(String firstName, String lastName, int age, int enrolment_number, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolment_number = enrolment_number;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "enrolement_number")
    public int getEnrolment_number() {
        return enrolment_number;
    }

    public void setEnrolment_number(int enrolment_number) {
        this.enrolment_number = enrolment_number;
    }
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
