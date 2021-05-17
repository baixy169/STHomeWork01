import java.util.Scanner;

//实现测试类SMTest，并在Main方法中执行StudentManager的App方法。
public class SMTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int select = 0;
        while (select != 6) {
            menu();
            select = scanner.nextInt();
            //5.14switch-case语句缺少最后一个default以确保处理全集。在这里直接把default加上。
            switch (select) {
                //插入
                case 1: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    System.out.println("生日: ");
                    String birDate = scanner.next();
                    System.out.println("学号: ");
                    int id = scanner.nextInt();
                    System.out.println("性别(1男0女): ");
                    //经过检查发现此处代码编写错误并更改。
                    //boolean gender = Boolean.parseBoolean(scanner.next());
                    boolean gender = scanner.nextInt() == 1;
                    System.out.println("年龄: ");
                    int age = scanner.nextInt();
                    Student student = new Student(id, name, birDate, gender, age);
                    studentManager.insert(student);
                    break;
                }
                //查找
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
                //删除
                case 3: {
                    System.out.println("姓名: ");
                    String name = scanner.next();
                    studentManager.deleteByName(name);
                    System.out.println("删除成功");
                    break;
                }
                //修改
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
                //输出
                case 5: {
                    studentManager.list();
                    break;
                }
                //退出
                case 6: {
                    break;
                }
                default: break;
            }
        }
    }
    //菜单界面。
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
