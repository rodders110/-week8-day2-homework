package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "courses")
public class Course {

    private int id;
    private String title;
    private Level level;
    private List<Student> enrolled;


    public Course() {
    }

    public Course(String title, Level level) {
        this.title = title;
        this.level = level;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Enumerated(value = EnumType.STRING)
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(List<Student> enrolled) {
        this.enrolled = enrolled;
    }
}
