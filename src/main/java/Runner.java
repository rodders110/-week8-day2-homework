import db.DBCourse;
import db.DBHelper;
import models.Course;
import models.Level;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("Art and English", Level.BA);
        DBHelper.save(course1);
        Student student = new Student("Roddy", "Daly", 31, 1, course1);
        DBHelper.save(student);


        List<Student> courseList = DBCourse.enrolled(course1);

    }
}
