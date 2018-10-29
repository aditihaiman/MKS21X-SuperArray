/*public class Driver {
  public static void main(String[] args) {
    SuperArray list = new SuperArray();

    System.out.println("TESTING PHASE 1:");

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

    list.clear();
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
    System.out.println("\nShould print size as 25: ");
    System.out.println(list.size());


    System.out.println("\n Testing remove by index:");
    list.remove(11);
    System.out.println("\nShould print [hi, hi, ..., bye, hi, hi...]: ");
    System.out.println(list);
    System.out.println("\nShould print size as 24:");
    System.out.println(list.size());


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



    System.out.println();
    System.out.println();
    System.out.println();

    SuperArray list2 = new SuperArray();
    for (int x = 0; x < 10; x++) {list2.add("hi");}

    System.out.println(list2);
    System.out.println(list2.size());
    list2.add(2, "bye");
    System.out.println(list2);
    System.out.println(list2.size());

    list2.remove(2);
    System.out.println(list2);

  }
} */

public class Driver {
  public static void main(String[] args) {
  //  try {
      System.out.print("\n\n\n\n");

      /**************************************************************************/

      SuperArray SA = new SuperArray(15);
      System.out.println("Created an empty SuperArray \"SA\" with capacity 15\n\n");

      /**************************************************************************/

      System.out.println("SA's status: \n" + SA.toStringDebug());
      System.out.println("SA is empty (should return true):  " + SA.isEmpty());
      System.out.println("SA's size:                         " + SA.size());

      /**************************************************************************/

      SA.add(0,"Muse");
      SA.add(1,"505");
      SA.add(2,"Radiohead");
      SA.add(3,"Haken");
      //SA.add(5, "Genesis");     //Comment in this line to check to see if it throws an error
      System.out.println("\nAdded \"Muse\", \"505\", \"Radiohead\", \"Haken\" to SA");
      System.out.println("SA's current value':               " + SA.toString());
      System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
      System.out.println("SA is empty (should return false): " + SA.isEmpty());

      /**************************************************************************/

      SA.set(1, "42");
      System.out.println("\nSetting SA[1] to \"42\"...");
      System.out.println("\nChecking set value:                " + SA.get(1) + "\n\n");

      System.out.println("Trying to set a value an index that is out of bounds");
      //SA.set(4,"Celestial Elixir is the best song"); //Comment in this line to check to see if it throws an error

      /**************************************************************************/

      for (int i = SA.size(); i < 19; i++) {
        SA.add("" + i);
      }
      System.out.println("\nFilling empty slots of SA with integers...");
      System.out.println("Full status of SA:                 " + SA.toStringDebug() + "\n");
      System.out.println("Adding \"Dream Theater\" to SA to test resize...");
      SA.add("Dream Theater");
      System.out.println("SA (capacity should have doubled + 1): " + SA.toStringDebug() + "\n\n");

      /**************************************************************************/

      System.out.println("Checking SA for \"Muse\":      " + SA.contains("Muse"));
      System.out.println("This should return true!");
      System.out.println("Checking SA for \"Kendrick Lamar\"    " + SA.contains("Kendrick Lamar"));
      System.out.println("This should return false!\n\n");
      System.out.println("Trying to get a value at an index that is out of bounds");
      //System.out.println(SA.get(35));                 //Comment in this line to check to see if it throws an error

      /**************************************************************************/

      SA.add(5, "Thank You Scientist");
      System.out.println("\nAdding \"Thank You Scientist\" to index 5...");
      System.out.println("SA status:                         " + SA.toString());
      SA.remove(6);
      System.out.println("\nRemoving the number \"5\" from index 6...");
      System.out.println("SA status:                         " + SA.toString());
      SA.remove("42");
      System.out.println("\nRemoving the number \"42\" from SA...");
      System.out.println("SA status:                         " + SA.toString() + "\n\n");

      System.out.println("\nTrying to remove an index that is out of bounds");
      //SA.remove(35);  //Comment in this line to check to see if it throws an error

      SA.set(5,"MGMT");
      System.out.println("Setting \"MGMT\" to index 5...");
      System.out.println("SA status:                         " + SA.toString());
      SA.set(10,"MGMT");
      System.out.println("Setting \"MGMT\" to index 10...");
      System.out.println("SA status:                         " + SA.toString());
      System.out.println("Checking SA for first index of \"MGMT\":                       " + SA.indexOf("MGMT"));
      System.out.println("Checking SA for last index of \"MGMT\":                       " + SA.lastIndexOf("MGMT"));

      System.out.println("Clearing SA");
      SA.clear();
      System.out.println(SA.toString());
  //  }

    System.out.println("––––––––––––––––––––––");
    System.out.println("Testing Exceptions:");

    SuperArray list = new SuperArray(2);

    try {
      //list.add(4, "hi");
      //list.remove(5);
      //list.get(5);
      list.set(4, "hello");
    } catch(IndexOutOfBoundsException e) {
      System.out.println("Caught a problem in the main");
    }
  }
}
