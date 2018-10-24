public class Driver {
  public static void main(String[] args) {
    SuperArray list = new SuperArray();

    for (int x = 0; x < 100; x++) {
      list.add("hi");
    }
    System.out.println(list); //should print [hi, hi, hi, hi, hi, hi, hi, hi, hi, hi]
    list.set(3, "hello");
    System.out.println(list);

  }
}
