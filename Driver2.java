/*public class Driver2{
	public static void main(String[] args){
    //phase 2 testing start
    System.out.println("Phase 2 testing, start!");
    //testing resize()
    SuperArray letters = new SuperArray();

    for (int x = 0; x < 20; x++){
      System.out.println();
			letters.add("a");
      System.out.println("Size: " + letters.size());
      System.out.println(letters);
		} //array should now be filled to index 19

    System.out.println();
    System.out.println("Phase 2 testing, end");
    // phase 2 testing end

    System.out.println();
    System.out.println();

    // phase 2 testing end
    System.out.println("Phase 3 testing, start!");
    System.out.println();

    //testing contains()
    SuperArray randomLetters = new SuperArray();
    randomLetters.add("b");
    randomLetters.add("f");
    randomLetters.add("g");
    randomLetters.add("c");
    randomLetters.add("z");

    System.out.println(randomLetters); //should print [b,f,g,c,z]

    if (randomLetters.contains("a")){
      System.out.println("a is in the array");
    } else {
      System.out.println("a is not in the array");
    } //should print "a is not in the array"

    if (randomLetters.contains("c")){
      System.out.println("c is in the array");
    } else {
      System.out.println("c is not in the array");
    } //should print "c is in the array"

    System.out.println();

    //testing indexOf() and lastIndexOf()
    randomLetters.add("b");
    randomLetters.add("z");
    System.out.println(randomLetters); //should print [b,f,g,c,z,b,z]

    System.out.println("The first occurance of b is at: " + randomLetters.indexOf("b")); //should print 0
    System.out.println("The first occurance of f is at: " + randomLetters.indexOf("f")); //should print 1
    System.out.println("The first occurance of g is at: " + randomLetters.indexOf("g")); //should print 2
    System.out.println("The first occurance of c is at: " + randomLetters.indexOf("c")); //should print 3
    System.out.println("The first occurance of z is at: " + randomLetters.indexOf("z")); //should print 4
    System.out.println("The first occurance of j is at: " + randomLetters.indexOf("j")); //should print -1

    System.out.println();

    System.out.println("The last occurance of b is at: " + randomLetters.lastIndexOf("b")); //should print 5
    System.out.println("The last occurance of f is at: " + randomLetters.lastIndexOf("f")); //should print 1
    System.out.println("The last occurance of g is at: " + randomLetters.lastIndexOf("g")); //should print 2
    System.out.println("The last occurance of c is at: " + randomLetters.lastIndexOf("c")); //should print 3
    System.out.println("The last occurance of z is at: " + randomLetters.lastIndexOf("z")); //should print 6
    System.out.println("The last occurance of j is at: " + randomLetters.lastIndexOf("j")); //should print -1

    System.out.println();

    //testing add(int,String)
    System.out.println(randomLetters);//should print [b,f,g,c,z,b,z]

    randomLetters.add(2, "a");
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]
    randomLetters.add(10, "a");//should print error


    System.out.println();

    //testing remove()
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]

    System.out.println(randomLetters.remove(9));//should print null
    System.out.println(randomLetters.remove(1));//should print f;
    System.out.println(randomLetters);//should print [b,a,g,c,z,b,z]

    System.out.println();
    System.out.println(randomLetters.remove("d"));//should print false
    System.out.println(randomLetters.remove("z"));//should print true
    System.out.println(randomLetters);//should print [b,a,g,c,b,z]

    System.out.println();
    System.out.println("Phase 3 testing, end");
  }
} */

public class Driver2 {

  public static void main(String[] args) {


    System.out.println("TESTING PHASE 1 and 2... except clear() which will be at the end");

    System.out.println();
    System.out.println();
    System.out.println("Testing SuperArray(int) ... SA should be [] even when debugged");
    SuperArray SA = new SuperArray(0);

    System.out.println("Testing toString() and toStringDebug ... Expected: []");
    System.out.println("Current Status of SA: " + SA.toStringDebug());

    System.out.println();

    System.out.println("Testing isEmpty() ... Expected : true");
    System.out.println("isEmpty?: " + SA.isEmpty());

    System.out.println();

    System.out.println("Testing add(String) ... Expected : true");
    System.out.println("Did we add \"A\" to SA? :" + SA.add("A"));
    System.out.println("Expected : [A]");
    System.out.println("Testing toString() ... Current Status of SA : " + SA);
    System.out.println("Testing isEmpty() ... Expected : false");
    System.out.println("isEmpty?: " + SA.isEmpty());
    System.out.println("Testing size() ... Expected : 1");
    System.out.println("Size: " + SA.size());

    System.out.println();

    System.out.println("Adding \"B\" to SA?: " + SA.add("B"));
    System.out.println("Testing resize() and toStringDebug ... Expected [A, B, null]");
    System.out.println("Current Status of SA: " + SA.toStringDebug());
    System.out.println("Testing get(int) ... Expected : B");
    System.out.println("SA[1] == " + SA.get(1));
    System.out.println("Testing get(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.get(2);
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }
    try{
      SA.get(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }

    System.out.println();

    System.out.println("Testing set(int,String) ...  Expected : A");
    System.out.println("\"C\" will replace : " + SA.set(0,"C"));
    System.out.println("Expected : [C, B]");
    System.out.println("SA\'s Current Status: " + SA);
    System.out.println("Testing set(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.set(2,"C");
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }
    try{
      SA.set(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }

    System.out.println();
    System.out.println("Expected : [C, B]");
    System.out.println("SA\'s Current Status after Testing Phase 1: " + SA);
    System.out.println("Expected : [C, B, null]");
    System.out.println("SA\'s Current debugged Status after Testing Phase 1: " + SA.toStringDebug());
    System.out.println();
    System.out.println("******************************************************");
    System.out.println();
    System.out.println("TESTING PHASE 2 and 3 ...");

    System.out.println();

    System.out.println("Testing add(int.String) ... Expected : SA should be [C, D, B, E]");
    SA.add(1,"D");
    SA.add(3, "E");
    System.out.println("SA\'s Current Status: " + SA);
    System.out.println("Testing add(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.add(5,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }
    try{
      SA.add(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println();

    System.out.println("Testing resize() ... Expected: SA when debugged should be [C, D, B, E, null, null, null]");
    System.out.println(SA.toStringDebug());

    System.out.println();

    System.out.println("Testing contains(String) ... Expected : true");
    System.out.println("Does SA contain \"C\" ?: " + SA.contains("C"));
    System.out.println("Expected : false");
    System.out.println("Does SA contain \"C\" ?: " + SA.contains("F"));

    System.out.println("Testing indexOf(String) ... Expected : 3");
    System.out.println("Where is \"E\" in SA? :" + SA.indexOf("E"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"E\" in SA? :" + SA.indexOf("Z"));

    System.out.println();

    SA.add("C");
    System.out.println("Added \"C\" to the end of the list using add(String)");
    System.out.println("Status of SA is: " + SA);

    System.out.println();

    System.out.println("Testing lastIndexOf(String) ... Expected : 4");
    System.out.println("Where is \"C\" in SA? :" + SA.lastIndexOf("C"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"Z\" in SA? :" + SA.lastIndexOf("Z"));

    System.out.println();

    System.out.println("Testing remove(int) ...  Expected : Removed element is D");
    System.out.println("The element that is removed is : " + SA.remove(1));
    System.out.println("Expected: SA is [C, B, E, C]");
    System.out.println("Current Status of SA: " + SA);
    System.out.println("Testing remove(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.remove(7);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }
    try{
      SA.remove(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }

    System.out.println();

    System.out.println("Testing remove(String) ...  Expected : true");
    System.out.println("The first element, \"C\" is removed ? : " + SA.remove("C"));
    System.out.println("Expected: SA is [B, E, C]");
    System.out.println("Current Status of SA: " + SA);
    System.out.println("Expected: false");
    System.out.println(SA.remove("ASD"));

    System.out.println();

    System.out.println("Testing clear() ... Expected : SA should be []");
    SA.clear();
    System.out.println(SA);

    System.out.println();

    System.out.println("END OF TESTING");
  }
}
