 public class SuperArray {
   private String[] data;
   private int size;

   public SuperArray() {
     data = new String[10];
     size = 0;
   }

   public SuperArray(int len) {
     size = 0;
     data = new String[len];
   }

   public void clear() {
     size = 0;
     for (int x = 0; x < data.length; x++) {
       data[x] = null;
     }
   }

   public int size() {
     return size;
   }

   public boolean isEmpty() {
     return size == 0;
   }

   public boolean add(String item) {
     if (this.size >= this.data.length) {
       this.resize();
     }
      this.data[this.size] = item;
      this.size++;
      return true;
   }

   public String toString(){
     if (size == 0) return "[]";
     String output = "[";
     for (int x = 0; x < this.size; x++) {
       output += this.data[x] + ", ";
     }
     return output.substring(0, output.length()-2) + "]";
   }

   public String toStringDebug() {
     String output = "[";
     for (int x = 0; x < this.data.length; x++) {
       if (this.data[x] != null) {
         output += this.data[x] + ", ";
       }
       else {
         output += "null, ";
       }
     }
     return output.substring(0, output.length()-2) + "]";
   }

   public String get(int index) {
     if (index < 0 || index >= size) {
       System.out.println("Error: Index out of range");
       return null;

     }
     else {return this.data[index];}
   }

   public String set(int index, String item) {
     if (index < 0 || index >= size) {
       System.out.println("Error: Index out of range");
       return null;
     }
     else {
       String old = this.data[index];
       this.data[index] = item;
       return old;
     }
   }

   private void resize() {
     String[] temp = new String[this.size * 2 + 1];
     for (int x = 0; x < this.size; x++) {
       temp[x] = this.data[x];
     }
     this.data = temp;
   }

   public boolean contains(String target) {
     boolean output = false;
     for (int x = 0; x < this.size; x++) {
       if (this.data[x] == target) output = true;
     }
     return output;
   }

   public int indexOf(String target) {
     for (int x = 0; x < this.size; x++) {
       if (this.data[x].equals(target)) {return x;}
     }
     return -1;
   }

   public int lastIndexOf(String target) {
     for (int x = this.size-1; x >= 0; x-=1) {
       if (this.data[x].equals(target)) {return x;}
     }
     return -1;
   }

   public void add(int index, String item) {
     if (index < 0 || index > this.size) {
       System.out.println("Error: Index out of range");
     }
     if (index == this.size) this.add(item);
     else{
       SuperArray temp = new SuperArray(this.data.length+1);
       for (int x = 0; x < this.data.length; x++) {
         if (x == index) {
           temp.add(item);
         }
          temp.add(this.data[x]);
        }
        this.add("hi");
        this.data = temp.data;
      }
    }



   public String remove(int index) {
     if (index < 0 || index >= size) {
       System.out.println("Error: Index out of range");
     }
     String output = this.data[index];
     int idx = 0;
     String[] temp = new String[this.data.length-1];
     for (int x = 0; x < this.data.length-2; x++) {
       if (x == index) {
         x++;
         idx = 1;
       }
       temp[x-idx] = this.data[x];
     }
     this.data = temp;
     return output;
   }

   public boolean remove(String item) {
     if (!this.contains(item)) return false;
     String[] temp = new String[this.data.length-1];
     for (int x = 0; x < this.data.length; x++) {
       if (temp[x].equals(item)) x++;
       temp[x] = this.data[x];
     }
     this.data = temp;
     return true;
   }







 }
