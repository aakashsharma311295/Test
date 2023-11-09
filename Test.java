import java.util.*;

public class Test {

/*    A university which has students like below
    S1, S2, S3, S4. ....SN

    And Each of the Students can opt as many courses as they like which would be like below
    S1 -> C1, C2, C3, C4
    S2 -> C2, C4, C7, C9
    S3 -> C2, C8, C11,c9
    S4 -> C5, C6, C7

    c7 - [s2,s4]
    c5-[s4]
    c6 - [s4]
    Rohit Badagi3:10 PM
1. Find the courses common between atleast two students*/

    static Map<Student, List<Course>> initialise(){
        Map<Student, List<Course>> map = new HashMap<>();
        List<Course> student1Courses = new ArrayList<>();
        student1Courses.add(new Course("C1"));
        student1Courses.add(new Course("C2"));
        student1Courses.add(new Course("C3"));
        student1Courses.add(new Course("C4"));
        map.put(new Student("S1"), student1Courses);
        List<Course> student2Courses = new ArrayList<>();
        student2Courses.add(new Course("C2"));
        student2Courses.add(new Course("C4"));
        student2Courses.add(new Course("C7"));
        student2Courses.add(new Course("C9"));
        map.put(new Student("S2"), student2Courses);
        List<Course> student3Courses = new ArrayList<>();
        student3Courses.add(new Course("C2"));
        student3Courses.add(new Course("C8"));
        student3Courses.add(new Course("C11"));
        map.put(new Student("S3"), student3Courses);
        List<Course> student4Courses = new ArrayList<>();
        student4Courses.add(new Course("C5"));
        student4Courses.add(new Course("C6"));
        student4Courses.add(new Course("C7"));
        map.put(new Student("S4"), student4Courses);
        return map;
    }

    public static void main(String[] args) {
        Map<Student, List<Course>> studentCourseMappings = initialise();

        Map<String, Set<String>> courseMappings = new HashMap<>();

        for (Student student : studentCourseMappings.keySet()){
            List<Course> courses = studentCourseMappings.get(student); // [C1,C2,C3,C4]
            for (Course course : courses){
                if (!courseMappings.containsKey(course.getCourseName())){
                    Set<String> list = new HashSet<>();
                    list.add(student.getName());
                    courseMappings.put(course.getCourseName(), list); // C1 --[S1], c2--[s1,s2]
                }else {
                    courseMappings.get(course.getCourseName()).add(student.getName());
                }
            }
        }

//        for (c)
    }
}
