
package Nim;

public class Stack {
    int index;
    int size;

    public Stack(int index, int size) {
        this.index = index;
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + "|";
        }
        return "s";
    }
    
     public void decrease(int amount) {
         setSize(getSize() - amount);
     }
     
     public boolean isEmpty() {
         return getSize() == 0;
     }
    
    
    
}
