import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void insert(Student student) {
        students.add(student);
    }

    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public void deleteByName(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    public void update(Student student, int age) {
        student.setAge(age);
    }

    public void list() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
