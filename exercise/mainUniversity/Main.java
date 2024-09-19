package mainUniversity;

import university.Course;
import university.Enrollment;
import university.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.studentId = 1;
        student.name = "Ami";

        Course course = new Course();
        course.courseId = 12;
        course.courseName = "Cal 1";

        Enrollment enrollment = new Enrollment();
        enrollment.course = course;
        enrollment.student = student;

        System.out.println("Student ID: " + enrollment.student.studentId + ", Name: " + enrollment.student.name);
        System.out.println("Course ID: " + enrollment.course.courseId + ", Name: " + enrollment.course.courseName);

    }
}
