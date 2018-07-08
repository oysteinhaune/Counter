package sample;

public class Counter {

    private int Counter;

    public Counter(int countNumber) {
        this.Counter = countNumber;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }

    public void count() {
        this.Counter += 1;
    }

    public void reset() {
        this.Counter = 0;
    }
}
