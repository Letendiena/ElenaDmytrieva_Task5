package ai.skillo;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
    return s1.getMark() - s2.getMark();
  }
}