public class Student {
    private int id;
    private String name;
    private String birDate;
    private boolean gender;
    private int age;

    public Student(int id, String name, String birDate, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", birDate='" + birDate + '\'' +
            ", gender=" + gender +
            ", age=" + age +
            '}';
    }
}
