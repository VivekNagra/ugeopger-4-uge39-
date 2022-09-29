import java.util.ArrayList;

public class Course
{
    private String name;
    private static ArrayList<Course> courses= new ArrayList<>();

    public static void main(String[] args)
    {
        Course course1 = new Course("OOP - DAT1");
        Course course2 = new Course ("Business101");
        Course course3 = new Course("Technology");

        addCourse(course1);
        addCourse(course2);
        addCourse(course3);

        System.out.println(courses.toString());

    }

    // creates course objects (constructor)
    public Course(String name)
    {
        this.name = name;
    }

    public static void addCourse(Course course)
    {
        courses.add(course);
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public String toString()
    {
        return "Course Name: " + "{ " + getName() + " }" + '\'';
    }

    public String getName()
    {
        return name;
    }
}
