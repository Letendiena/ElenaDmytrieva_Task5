package ai.skillo;

import java.util.*;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    System.out.println("\n------1. Queue/DequeClass.java. Создаем очередь в поликлинике------");

    Deque<Integer> queue1 = new ArrayDeque<>();
    int c = 0;
    int n = 1;
    int e = 15;
    while (c < 15) {
      if ((c + 1) % 3 == 0) {
        queue1.offerLast(e);
        System.out.println(queue1.getLast());
        queue1.pollLast();
        e--;
      } else {
        queue1.offerFirst(n);
        System.out.println(queue1.peek());
        queue1.poll();
        n++;
      }
      c++;
    }
    System.out.println("\n----- Создаем гонку на выбывание ------");

    Deque<String> queue2 = new ArrayDeque<>();
    queue2.add("Red");
    queue2.add("Orange");
    queue2.add("Yellow");
    queue2.add("Green");
    queue2.add("Light blue");
    queue2.add("Blue");
    queue2.add("Violet");

    Iterator<String> iterator = queue2.iterator();
    while (iterator.hasNext()) {
      System.out.println(queue2.peekLast());
      queue2.removeLast();
      if (queue2.size() == 1) {
        System.out.println(queue2.peekLast());
        break;
      }
    }
    System.out.println(queue2);

    System.out.println("\n--------------2. ListClass.java---  Создаем список-----------");

    List<Integer> integerList = new ArrayList<>();
    int counter = 0;
    int elements = 20; // max elements
    while (counter < elements) {
      integerList.add(0);
      counter++;
    }
// Создаем список в котором добавляем элементы поочередно в начало и конец списка:
    int index = 0;
    int element = 1;
    int number = elements - 1;
    while (index < (elements / 2)) {
      integerList.set(index, element);
      element++;
      integerList.set(number, element);
      index++;
      element++;
      number--;
    }
    System.out.println(integerList);

    // после чего вычитываем данный список наоборот (по элементу с конца и начала):
    int inx = 0;
    int b = elements - 1;
    while (inx < (elements / 2)) {
      System.out.println(integerList.get(b));
      System.out.println(integerList.get(inx));
      inx++;
      b--;
    }

    System.out.println("\n-------------Создаем игру “Дженга”---------------");

    List<String> djengaList = new LinkedList<>();
    djengaList.add("One");
    djengaList.add("Two");
    djengaList.add("Three");
    djengaList.add("Four");
    djengaList.add("Five");
    djengaList.add("Six");
    System.out.println("Game elements: " + djengaList);

    Random dice = new Random();
    int num;
    String name;
    for (int counter1 = 1; counter1 <= 5; counter1++) {
      num = 1 + dice.nextInt(4);
      name = djengaList.get(num);
      djengaList.remove(name);
      djengaList.add(5, name);
      System.out.println("Element: " + num + " - " + name);
    }
    System.out.println("Game result: " + djengaList);

    System.out.println("\n-----3. SetClass.java --  Создаем список кредитных карточек банка------");

    Set<String> cardSet = new HashSet<>();
    cardSet.add("1111 2222 3333 4444");
    cardSet.add("2222 0000 1111 5555");
    cardSet.add("5555 2222 7777 5555");
    cardSet.add("9999 2222 5555 3333");
    cardSet.add("5555 4444 6666 7777");
    System.out.println("Credit card list: " + cardSet);

    System.out.println("\n-----Создаем список грузов------");
    Set<Integer> cargoSet = new HashSet<Integer>();
    final int CONST = 11000;
    cargoSet.add(1000);
    cargoSet.add(2000);
    cargoSet.add(3000);
    cargoSet.add(4000);
    cargoSet.add(5000);
    int sum = 0;
    int a = 0;
    Iterator<Integer> iterator2 = cargoSet.iterator();
    while (iterator2.hasNext()) {
      sum = iterator2.next() + sum;
    }
    System.out.println("Cargo sum: " + sum);
    if (CONST < sum) {
      a = sum - CONST;
    }
    System.out.println("Differance: " + a);

    for (Integer cargo : cargoSet) {
      if (cargo >= a) {
        cargoSet.remove(cargo);
        break;
      }
    }
    System.out.println("Left cargo: " + cargoSet);

    Iterator<Integer> iterator4 = cargoSet.iterator();
    while (iterator4.hasNext()) {
      iterator4.next();
      iterator4.remove();
    }
    System.out.println(cargoSet);

    System.out.println("\n-----4. MapClass.java------");

    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("Nick2020", "Nick");
    stringMap.put("Svetik555", "Svitlana");
    stringMap.put("Mikelangello", "Michael");
    stringMap.put("Jo777", "John");
    stringMap.put("Bi", "Bill");

    if (stringMap.containsKey("Svetik555")) {
      System.out.println("User with this nick already exists");
    } else {
      System.out.println("Make registration");
    }
    System.out.println(stringMap);
    stringMap.remove("Jo777");
    System.out.println(stringMap);

    System.out.println("\n---------- SortingClass.java ----------");

    List<Student> alStudent = new ArrayList<>();
    alStudent.add(new Student("Bob", 3, 18));
    alStudent.add(new Student("Bill", 5, 19));
    alStudent.add(new Student("Jo", 4, 17));
    alStudent.add(new Student("Nikol", 5, 18));
    alStudent.add(new Student("Oliver", 3, 20));

    System.out.println("Unsorted: ");
    for (int i = 0; i < alStudent.size(); i++) {
      System.out.println(alStudent.get(i));
    }

    Collections.sort(alStudent, new NameComparator());

    System.out.println("\nSorted by name: ");
    for (int i = 0; i < alStudent.size(); i++) {
      System.out.println(alStudent.get(i));
    }

    Collections.sort(alStudent, new MarkComparator());

    System.out.println("\nSorted by mark: ");
    for (int i = 0; i < alStudent.size(); i++) {
      System.out.println(alStudent.get(i));
    }

    Collections.sort(alStudent, new AgeComparator());

    System.out.println("\nSorted by age: ");
    for (int i = 0; i < alStudent.size(); i++) {
      System.out.println(alStudent.get(i));
    }
  }
}

