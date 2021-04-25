import java.util.Scanner;

public class SMTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int select = 0;
        while (select != 6) {
            menu();
            select = scanner.nextInt();
            switch (select) {
                case 1: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    System.out.println("生日: ");
                    String birDate = scanner.next();
                    System.out.println("学号: ");
                    int id = scanner.nextInt();
                    System.out.println("性别(1男0女): ");
                    boolean gender = Boolean.parseBoolean(scanner.next());
                    System.out.println("年龄: ");
                    int age = scanner.nextInt();
                    Student student = new Student(id, name, birDate, gender, age);
                    studentManager.insert(student);
                    break;
                }
                case 2: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    Student student = studentManager.findByName(name);
                    if (student == null) {
                        System.out.println("没找到");
                    } else {
                        System.out.println(student);
                    }
                    break;
                }
                case 3: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    studentManager.deleteByName(name);
                    System.out.println("删除成功");
                    break;
                }
                case 4: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    Student student = studentManager.findByName(name);
                    if (student == null) {
                        System.out.println("没找到");
                    } else {
                        System.out.println("年龄: ");
                        int age = scanner.nextInt();
                        studentManager.update(student, age);
                        System.out.println("修改成功");
                    }
                    break;
                }
                case 5: {
                    studentManager.list();
                    break;
                }
                case 6: {
                    break;
                }
            }
        }
    }

    public static void menu() {
        System.out.println("******************************");
        System.out.println("*           1.插入           *");
        System.out.println("*           2.查找           *");
        System.out.println("*           3.删除           *");
        System.out.println("*           4.修改           *");
        System.out.println("*           5.输出           *");
        System.out.println("*           6.退出           *");
        System.out.println("******************************");
    }
}
