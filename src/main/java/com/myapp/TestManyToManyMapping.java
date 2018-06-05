package com.myapp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.dao.AbstractDao;
import com.myapp.model.Course;
import com.myapp.model.Student;
import com.myapp.service.StudentService;

/**
 * Hello world!
 *
 */
public class TestManyToManyMapping  extends AbstractDao
{
    public static void main( String[] args )
    {
        System.out.println( "Code execution started!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentService service = (StudentService) context.getBean("studentService");
        
        Set<Course> courses = new HashSet<Course>();
		courses.add(new Course("Maths"));
		courses.add(new Course("Computer Science"));

		Student student1 = new Student("Joe", courses);
        service.saveStudent(student1);

        Student student2 = new Student("Ross", courses);
        service.saveStudent(student2);
        
        System.out.println( "Code executed successfully!" );
    }
}
