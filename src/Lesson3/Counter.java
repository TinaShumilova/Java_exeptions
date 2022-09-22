package Lesson3;

public class Counter implements AutoCloseable {
    int a = 0;

    public int add(){
        return this.a += 1;
    }

    @Override
    public void close() throws Exception {

    }
}
