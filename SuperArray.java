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

   public boolean isEmpty() {
     return size == 0;
   }

   public add(String item) { // should have return type boolean???
/*     if (this.size > this.data.length) {
       this.resize();
     } */
      this.data[this.size] = item;
   }

   public String toString(){
     String output = "[";
     for (int x = 0; x < this.size; x++) {
       output += this.data[x]; + ", ";
     }
     return output.substring(0, output.length()-2) + "]";
   }

   public String toStringDebug() {
     String output = "[";
     for (int x = 0; x < this.data.length; x++) {
       output += this.data[x]; + ", ";
     }
     return output.substring(0, output.length()-2) + "]";
   }

   public String get(int index) {
     
   }








 }
