package chapter13;

import java.util.Arrays;

public class WildCardExample {

    public static void registerCourse(Course<?> course) {   //모든 타입
        System.out.println(course.getName() + " 수강생 " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생 " + Arrays.toString(course.getStudents()));
    }
}