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
    System.out.println("Should return [hello, hi, hi...]: ");
    System.out.println(list);

    System.out.println("\nShould print \"hello\": \n" + list.get(0)); //should print hello
    System.out.println("\nShould print \"hi\": \n" +list.get(5)); //should print hi
    System.out.println("\nShould print \"Error: Index out of range\" and return null: \n" +list.get(1000)); //should print null

    System.out.println("\nTesting clear; should return []");
    list.clear();
    System.out.println(list);

    System.out.println("\nTesting set at index");
    System.out.println("\nShould print \"Error: Index out of range\" and return null: \n" +list.set(10, "no"));
    for (int x = 0; x < 25; x++) {
        list.add("hi");
      }
    System.out.println(list + "\n");
    System.out.println("\nShould print \"hi\": \n" + list.set(10, "bye")); //should return "hi"
    System.out.println(list);


    System.out.println("---------------------- \n");
    System.out.println("TESTS FOR PHASE 3");

    System.out.println("Testing contains():");
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
