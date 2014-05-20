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

    public void decrease(int amount) {
        if (amount > 0) {
            if (getSize() > 0 && getSize() >= amount) {
                setSize(getSize() - amount);
            } else {
                setSize(0);
            }
        }
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
