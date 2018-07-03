package db;

import com.sun.xml.internal.ws.handler.HandlerException;
import models.Course;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCourse {
    private static Session session;

    public static List<Student> enrolled(Course course){
        session = HibernateUtil.getSessionFactory().openSession();

        List<Student> results = null;

        try{
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("course" , course));
            results = cr.list();
        }catch (HandlerException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return results;
    }
}
