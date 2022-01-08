package commons;

public class LinkedList {
    int data;
    LinkedList next;

    public LinkedList(int data, LinkedList next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
