import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//2.1原来的代码中缺少必要的注释。
//3.4代码段落没有被合适地以空行分割，现已改正。
public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void insert(Student student) {
        students.add(student);
    }
     //5.13if-else语句后缺少else以确保处理全集。
     /*public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }*/
    
    //4.2去掉单个循环和条件语句的{}。
    //通过名字查找。
    public Student findByName(String name) {
        for (Student s : students) {
            /*if (s.getName().equals(name)) {
                return s;
            }*/
        	if (s.getName().equals(name)) return s;
            else return null;
        }
    }

    //通过名字删除。
    public void deleteByName(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    //修改年龄。
    public void update(Student student, int age) {
        student.setAge(age);
    }

  //4.2去掉单个循环和条件语句的{}。
    public void list() {
        /*for (Student s : students) {
            System.out.println(s);
        }*/
    	for (Student s : students) System.out.println(s);
    }
}
