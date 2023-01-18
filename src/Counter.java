public class Counter {
    private int c;

    public Counter() {
        c = 0;
    }

    public void increment() {
        c = c + 1;
    }

    public void decrement() {
        c = c - 1;
    }

    public int getValue() {
        return c;
    }
}
