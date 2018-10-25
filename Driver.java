public class Driver {
  public static void main(String[] args) {
    SuperArray list = new SuperArray();

    System.out.println("TESTING PHASE 2:");

    System.out.println("Testing toString");
    System.out.println("\nShould print []:");
    System.out.println(list);
    list.add("food");
    System.out.println("\nShould print [food]");
    System.out.println(list);
    list.clear();
    System.out.println();

    System.out.println("Testing toStringDebug, should print [null, null...null]: ");
    System.out.println(list.toStringDebug());
    System.out.println();

    System.out.println("Testing size with empty list, should return 0: ");
    System.out.println(list.size());
    System.out.println("----------------");

    System.out.println("Testing add(String)");
    System.out.println("\nShould return true: \n" + list.add("hello"));
    for (int x = 0; x < 99; x++) {
        list.add("hi");
      }
    System.out.println("\nShould return [hello, hi, hi...]: ");
    System.out.println(list);

    System.out.println("\nShould print \"hello\": \n" + list.get(0)); //should print hello
    System.out.println("\nShould print \"hi\": \n" +list.get(5)); //should print hi
    System.out.println("\nShould print \"Error: Index out of range\" and return null:"); //should print null
    System.out.println(list.get(1000));

    System.out.println("\nTesting clear; should return []");
    list.clear();
    System.out.println(list);

    System.out.println("\nTesting set element at index");
    System.out.println("\nShould print \"Error: Index out of range\" and return null:");
    System.out.println(list.set(10, "no"));
    for (int x = 0; x < 25; x++) {
        list.add("hi");
      }
    System.out.println("\nShould print \"hi\": \n" + list.set(10, "bye")); //should return "hi"
    System.out.println("\nShould print [hi, hi..., bye, hi, hi...]: ");
    System.out.println(list);

    System.out.println("\n--------------------------------------------- \n");
    System.out.println("TESTS FOR PHASE 3");

    for (int x = 0; x < 25; x++) {
        list.add("hi");
      }
    list.set(10, "bye");

    System.out.println("\nTesting contains():");
    System.out.println("\nShould return true:");
    System.out.println(list.contains("hi"));
    System.out.println(list.contains("bye"));
    System.out.println("\n Should return false:");
    System.out.println(list.contains("hello"));
    System.out.println(list.contains(null));

    System.out.println();
    System.out.println("Testing for indexOf and lastIndexOf:");

    System.out.println("\nShould print 10: ");
    System.out.println(list.indexOf("bye"));
    System.out.println("\n Should print 0: ");
    System.out.println(list.indexOf("hi"));
    System.out.println("\n Should print -1: ");
    System.out.println(list.indexOf("fish"));
    System.out.println("\n Should print 24: ");
    System.out.println(list.lastIndexOf("hi"));
    System.out.println("\n Should print 10: ");
    System.out.println(list.lastIndexOf("bye"));
    System.out.println("\n Should print -1: ");
    System.out.println(list.lastIndexOf("hello"));

    System.out.println("\nTesting add an element at an index:");
    System.out.println("Should print [hi, hi,..., bye, yes, hi, hi...]:");
    list.add(11, "yes");
    System.out.println(list);

    System.out.println("\n Testing remove by index:");
    list.remove(11);
    System.out.println(list);

    System.out.println("\n-------------------------------------------\n");

    System.out.println("TESTS FOR RESIZE:");

    list.clear();
    for (int x = 0; x < 10; x++) {
      list.add("yes");
    }
    System.out.println("\nShould print a lot of \"yes\": ");
    System.out.println(list);
    System.out.println("\nChecking size; should print 10000;");
    System.out.println(list.size());





  }

}
