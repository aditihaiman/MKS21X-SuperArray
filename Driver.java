public class Driver {
  public static void main(String[] args) {
    SuperArray list = new SuperArray();

    System.out.println("Testing toString, should print []: ");
    System.out.println(list);
    System.out.println();
    System.out.println("Testing toStringDebug, should print [null, null...null]: ");
    System.out.println(list.toStringDebug());
    System.out.println();
    System.out.println("Testing size with empty list, should return 0: ");
    System.out.println(list.size());
    System.out.println("----------------");
    System.out.println("Testing add(String)");
    System.out.println("Should return true: \n" + list.add("hello"));
    for (int x = 0; x < 99; x++) {
        list.add("hi");
      }
    System.out.println();
    System.out.println(list);

    System.out.println(list.get(0)); //should print hello
    System.out.println(list.get(5)); //should print hi
    System.out.println(list.get(1000)); //should print null

    System.out.println("Testing clear; should return []");
    list.clear();
    System.out.println(list);

    System.out.println("Testing set at index");
    System.out.println(list.set(10, "no"));
    for (int x = 0; x < 25; x++) {
        list.add("hi");
      }
    System.out.println(list);
    System.out.println(list.set(10, "bye")); //should return "hi"
    System.out.println(list);


    System.out.println("---------------------- \n");
    System.out.println("TESTS FOR PHASE 3");
    

/*    for (int x = 0; x < 100; x++) {
      list.add("hi");
    }
    System.out.println(list); //should print [hi, hi, hi, hi, hi, hi, hi, hi, hi, hi]
    list.set(3, "hello");
    System.out.println(list);

    System.out.println(list.size());

    System.out.println();
*/

  }

}
