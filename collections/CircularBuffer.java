/*
Problem: Circular buffer with overwrite on full.
Buffer size = 3
*/

public class CircularBuffer {

    int[] buffer;
    int size, index = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void add(int value) {
        buffer[index % size] = value;
        index++;
    }

    public void print() {
        for (int i : buffer) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        cb.print();
    }
}
