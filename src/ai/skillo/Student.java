package ai.skillo;

public class Student {

  private String name;
  private int mark;
  private int age;

  public Student(String name, int mark, int age) {
    this.name = name;
    this.mark = mark;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMark() {
    return mark;
  }

  public void setMark(int mark) {
    this.mark = mark;
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
        "name='" + name + '\'' +
        ", mark=" + mark +
        ", age=" + age +
        '}';
  }
}


