package day10_map;

public class Student {
    private String name, course, city;
    private int age;

    public Student(String name, String course, String city, int age) {
        this.name = name;
        this.course = course;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + course + ":" + city + ":" + age;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
