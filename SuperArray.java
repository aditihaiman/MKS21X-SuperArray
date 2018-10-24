 public class SuperArray {
   private String[] data;
   private int size;

   public SuperArray() {
     data = new String[10];
     size = 0;
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

   public int length() {
     return data.length;
   }

   public boolean isEmpty() {
     return size == 0;
   }

   public boolean add(String item) { // should have return type boolean???
/*     if (this.size > this.data.length) {
       this.resize();
     } */
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
     if (size == 0) return "[]";
     String output = "[";
     for (int x = 0; x < this.data.length; x++) {
       output += this.data[x] + ", ";
     }
     return output.substring(0, output.length()-2) + "]";
   }

   public String get(int index) {
     if (index < 0 || index >= size) return null;
     else {return this.data[index];}
   }

   public String set(int index, String item) {
     if (index < 0 || index >= size) return null;
     else {
       String old = this.data[index];
       this.data[index] = item;
       return old;
     }
   }








 }
