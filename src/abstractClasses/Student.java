package abstractClasses;

public class Student extends Person {
    private String major;

    /**
     *
     * @param name 学生姓名
     * @param major 学生主修课程
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }



    @Override
    public String getDescription() {
        return "a student majoring in:" + major;
    }
}
