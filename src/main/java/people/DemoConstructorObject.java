package people;

public class DemoConstructorObject {

    String name, surname, sex, jobTitle;
    int age;
    double salary;

    public DemoConstructorObject(String name, String surname, String sex, String jobTitle, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
