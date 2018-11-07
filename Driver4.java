import java.util.ArrayList;
public class Driver4 {
  public static void main(String[] args) {
    SuperArray arr = new SuperArray();

    System.out.println(arr); // should print []
    System.out.println(arr.size()); //should print 0
    System.out.println();

    System.out.println(arr.add("1")); //should print true
    arr.add("2");
    arr.add("3");
    System.out.println(arr); // should print [1, 2, 3]
    System.out.println(arr.size()); //should print 3

    for (int x = 4; x < 3004; x++) {
      arr.add(x + "");
    }
    System.out.println();
    System.out.println(arr.size()); // should print 3003
    //System.out.println(arr);


    arr.clear();
    System.out.println();
    System.out.println(arr);

    for (int x = 0; x < 10; x++) {
      arr.add(x+"");
    }

    System.out.println(arr);
    System.out.println(arr.remove(0));
    System.out.println(arr.size());
    System.out.println(arr.contains("6"));
    arr.add("10");
    System.out.println(arr);

    System.out.println(arr.remove("6"));
    System.out.println(arr);

    System.out.println("––––––––––––––––––");

    arr.add(5, "6");
    System.out.println(arr);

    System.out.println(arr.set(3, "hi"));
    System.out.println(arr);
    System.out.println(arr.size());
    try {
      System.out.println(arr.set(10, "hi"));
    }
    catch (Exception e) {
      System.out.println(e);
    }

    arr.clear();
    System.out.println();
    for (int x = 0; x < 600; x++){
      arr.add("hi");
    }

    System.out.println(arr.size());
    for (int x = 0; x < 600; x++) {
      if (!arr.set(x, "bye").equals("hi")) {
        System.out.println("wrong");
      }
    }

    System.out.println(arr.size());

    System.out.println("–––––––––––––––––");
    ArrayList<String> key = new ArrayList<String>();
    SuperArray ans = new SuperArray();
    for(int i = 0; i < 1000;i++) {
        ans.add(""+i);
        key.add(""+i);
        ans.add(0,""+i);
        key.add(0,""+i);
      }

    for (int i = 0; i < 1000; i++) {
      if (!ans.get(i).equals(key.get(i))) {
        System.out.println("WRONG");
      }
    }

    int count = 0;
      for(int i = 0; i < 100 && ans.set(i,"X"+i).equals(key.set(i,"X"+i));i++){
        count++;
      }
    System.out.println(count);

  }

}
