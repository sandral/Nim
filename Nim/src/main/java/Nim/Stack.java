package Nim;

public class Stack {

    int size;

    public Stack(int size) {
        this.size = size;
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
        return s;
    }

    public void decrease() {
        if (!isEmpty()) {
            setSize(getSize() - 1);
        }
     }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
